package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.ProductMapper;
import com.kingguanzhang.pojo.Product;
import com.kingguanzhang.pojo.ProductExample;
import com.kingguanzhang.service.ProductService;
import com.kingguanzhang.util.ImgUtil;
import com.kingguanzhang.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询所有商品
     * @param shopId
     * @return
     */
    @Override
    public List<Product> getProductList(Integer shopId) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        List<Product> productList = productMapper.selectByExample(productExample);
        return productList;
    }

    @Override
    public Product getProduct(Integer productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        return product;
    }

    @Override
    public void addProduct(Product product, InputStream productImgInputStream, String originalFilename) {
        if (null == product){
            throw new RuntimeException("商品信息解析失败");
        }

        try {
            product.setEnableStatus(1);//0代表上架,1代表下架
            product.setCreateTime(new Date());
            product.setEditTime(new Date());
            int effectedNum = productMapper.insert(product);
            System.out.println( "执行添加商品返回的结果值是 : " + effectedNum);
            if (effectedNum <= 0){

                throw new RuntimeException("商品创建失败");
            }else{
                if (null != productImgInputStream){
                    try{
                        String productImgAddr = addproductImg(product, productImgInputStream,originalFilename);
                    }catch (Exception e){
                        throw new RuntimeException("设置图片地址错误 : " + e.getMessage());

                    }

                }
            }
            int en = productMapper.updateByPrimaryKey(product);
            System.out.println("执行更新商品返回的结果值是 : " + en);
            if (en <= 0){
                throw new RuntimeException("更新商品图片信息失败");
            }
        }catch (Exception e){
            throw new RuntimeException("添加商品异常 : " + e.getMessage());
        }

    }

    @Override
    public int updateProduct(Product product) {
        int i = productMapper.updateByPrimaryKeySelective(product);
        return i;
    }

    @Override
    public Integer removeProduct(Integer productId) {
        int i = productMapper.deleteByPrimaryKey(productId);
        return i;
    }

    @Override
    public Integer shelveProduct(Integer productId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setEnableStatus(0);
        int i = productMapper.updateByPrimaryKeySelective(product);
        return i;
    }

    @Override
    public Integer unShelveProduct(Integer productId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setEnableStatus(1);
        int i = productMapper.updateByPrimaryKeySelective(product);
        return i;
    }

    /**
     * 查询所有上架中的商品
     * @param shopId
     * @return
     */
    @Override
    public List<Product> getShelveProductList(Integer shopId) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        criteria.andEnableStatusEqualTo(0);
        List<Product> productList = productMapper.selectByExample(productExample);
        return productList;
    }

    /**
     * 查询所有下架中的商品
     * @param shopId
     * @return
     */
    @Override
    public List<Product> getUnShelveProduct(Integer shopId) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        criteria.andEnableStatusEqualTo(1);
        List<Product> productList = productMapper.selectByExample(productExample);
        return productList;
    }

    /**
     * 批量删除商品
     * @param productIdList
     * @return
     */
    @Override
    public Integer deleteProducts(List<Integer> productIdList) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductIdIn(productIdList);
        int i = productMapper.deleteByExample(productExample);
        return i;
    }

    /**
     * 批量上架商品
     * @param productIdList
     * @return
     */
    @Override
    public Integer putawayProducts(List<Integer> productIdList) {
        Product product = new Product();
        product.setEnableStatus(0);
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductIdIn(productIdList);
        int i = productMapper.updateByExampleSelective(product,productExample);
        return i;
    }

    /**
     * 批量下架商品
     * @param productIdList
     * @return
     */
    @Override
    public Integer soldoutProducts(List<Integer> productIdList) {
        Product product = new Product();
        product.setEnableStatus(1);
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductIdIn(productIdList);
        int i = productMapper.updateByExampleSelective(product,productExample);
        return i;
    }

    private String addproductImg(Product product, InputStream productImgInputStream, String fileName) {
        String productImagePath = PathUtil.getProductImagePath(product.getProductId());
        String productImgAddr = ImgUtil.generateThumbnail(productImgInputStream,productImagePath,fileName);
        product.setImgAddr(productImgAddr);
        return productImagePath;
    }
}

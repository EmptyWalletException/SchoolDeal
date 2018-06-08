package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.ShopMapper;
import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.pojo.ShopExample;
import com.kingguanzhang.service.ShopService;
import com.kingguanzhang.util.ImgUtil;
import com.kingguanzhang.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    @Transactional
    public Msg addShop(Shop shop, InputStream shopImgInputStream, String fileName) {
        if (null == shop){
            return Msg.fail().setMsg("添加商店失败,店铺信息不能为空!");
        }

        try {
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setEditTime(new Date());
            int effectedNum = shopMapper.insert(shop);
            System.out.println( "执行添加店铺返回的结果值是 : " + effectedNum);
            if (effectedNum <= 0){

                throw new RuntimeException("店铺创建失败");
            }else{
                if (null != shopImgInputStream){
                    try{
                        String shopImgAddr = addShopImg(shop, shopImgInputStream,fileName);
                    }catch (Exception e){
                        throw new RuntimeException("设置图片地址错误 : " + e.getMessage());

                    }
                    
                }
            }
            int en = shopMapper.updateByPrimaryKeySelective(shop);
            System.out.println("执行更新店铺返回的结果值是 : " + en);
            if (en <= 0){
                throw new RuntimeException("更新店铺图片信息失败");
            }
        }catch (Exception e){
            throw new RuntimeException("添加店铺异常 : " + e.getMessage());
        }

        //在所有操作都执行完成之后,返回提示;
        return Msg.success().setMsg("添加店铺成功,请等待审核");
    }

    @Override
    public Shop getShop(Integer shopId) {
        Shop shop = shopMapper.selectByPrimaryKey(shopId);
        return shop;
    }

    @Override
    public Msg updateShop(Shop shop, InputStream shopImgInputStream, String fileName) {
        if (null == shop){
            return Msg.fail().setMsg("添加商店失败,店铺信息不能为空!");
        }

        try {
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setEditTime(new Date());

            if (null != shopImgInputStream){
                try{
                    String shopImgAddr = addShopImg(shop, shopImgInputStream,fileName);
                }catch (Exception e){
                    throw new RuntimeException("设置图片地址错误 : " + e.getMessage());

                }

            }

            int en = shopMapper.updateByPrimaryKeySelective(shop);
            System.out.println("执行更新店铺返回的结果值是 : " + en);
            if (en <= 0){
                throw new RuntimeException("更新店铺图片信息失败");
            }
        }catch (Exception e){
            throw new RuntimeException("添加店铺异常 : " + e.getMessage());
        }

        //在所有操作都执行完成之后,返回提示;
        return Msg.success().setMsg("添加店铺成功,请等待审核");
    }


    @Override
    public Shop getShopByUserId(Integer userId) {
        ShopExample shopExample = new ShopExample();
        ShopExample.Criteria criteria = shopExample.createCriteria();
        criteria.andOwnerIdEqualTo(userId);
        //实际上肯定之后查询到一个值
        List<Shop> shops = shopMapper.selectByExample(shopExample);
        Shop shop = shops.get(0);
        return shop;
    }

    /**
     * 获取所有商店;
     * @return
     */
    @Override
    public List<Shop> getAllShop() {
        List<Shop> shopList = shopMapper.selectByExample(null);
        return shopList;
    }


    private String addShopImg(Shop shop, InputStream shopImgInputStream,String fileName) {
        String shopImagePath = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImgUtil.generateThumbnail(shopImgInputStream,shopImagePath,fileName);
        shop.setShopImg(shopImgAddr);
        return shopImgAddr;
    }
}

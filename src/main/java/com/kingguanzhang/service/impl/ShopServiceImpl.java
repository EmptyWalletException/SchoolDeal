package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.ShopMapper;
import com.kingguanzhang.dto.ShopExecution;
import com.kingguanzhang.enums.ShopSateEnum;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.pojo.ShopCategory;
import com.kingguanzhang.service.ShopService;
import com.kingguanzhang.util.ImgUtil;
import com.kingguanzhang.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, InputStream shopImgInputStream,String fileName) {
        if (null == shop){
            return new ShopExecution(ShopSateEnum.NULL_SHOP);
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
            int en = shopMapper.updateByPrimaryKey(shop);
            System.out.println("执行更新店铺返回的结果值是 : " + en);
            if (en <= 0){
                throw new RuntimeException("更新店铺图片信息失败");
            }
        }catch (Exception e){
            throw new RuntimeException("添加店铺异常 : " + e.getMessage());
        }

        //在所有操作都执行完成之后,返回一个店铺操作状态为正在审核的实体类,实体类中包含刚刚执行完操作的店铺;
        return new ShopExecution(ShopSateEnum.CHECK,shop);
    }

    @Override
    public Shop getShop(Integer shopId) {
        Shop shop = shopMapper.selectByPrimaryKey(shopId);
        return shop;
    }

    @Override
    public int updateShop(Shop shop) {
        int i = shopMapper.updateByPrimaryKeySelective(shop);
        return i;
    }


    private String addShopImg(Shop shop, InputStream shopImgInputStream,String fileName) {
        String shopImagePath = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImgUtil.generateThumbnail(shopImgInputStream,shopImagePath,fileName);
        shop.setShopImg(shopImgAddr);
        return shopImgAddr;
    }
}

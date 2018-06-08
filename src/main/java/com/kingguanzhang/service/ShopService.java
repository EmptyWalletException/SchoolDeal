package com.kingguanzhang.service;

import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.Shop;

import java.io.InputStream;


public interface ShopService {
    public Msg addShop(Shop shop, InputStream shopImgInputStream, String fileName);


    public Shop getShop(Integer shopId);

    public int updateShop(Shop shop);

    Shop getShopByUserId(Integer userId);
}

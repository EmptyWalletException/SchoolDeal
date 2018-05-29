package com.kingguanzhang.service;

import com.kingguanzhang.dto.ShopExecution;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.pojo.ShopCategory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;
import java.util.List;


public interface ShopService {
    public ShopExecution addShop(Shop shop, InputStream shopImgInputStream,String fileName);


    public Shop getShop(Integer shopId);

    public int updateShop(Shop shop);
}

package com.kingguanzhang.service;

import com.kingguanzhang.dto.ShopExecution;
import com.kingguanzhang.pojo.Shop;
import org.springframework.stereotype.Service;

import java.io.File;


public interface ShopService {
    public ShopExecution addShop(Shop shop, File shopImg);
}

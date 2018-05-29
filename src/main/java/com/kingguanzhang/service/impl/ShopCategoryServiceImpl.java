package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.ShopCategoryMapper;
import com.kingguanzhang.pojo.ShopCategory;
import com.kingguanzhang.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Autowired
    ShopCategoryMapper shopCategoryMapper;

    @Override
    public List<ShopCategory> getShopCategorys() {
        List<ShopCategory> shopCategoryList = shopCategoryMapper.selectByExample(null);
        return shopCategoryList;
    }
}

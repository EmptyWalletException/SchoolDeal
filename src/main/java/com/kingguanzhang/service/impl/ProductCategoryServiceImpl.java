package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.ProductCategoryMapper;
import com.kingguanzhang.pojo.ProductCategory;
import com.kingguanzhang.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public List<ProductCategory> getCategory() {
        List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(null);
        return productCategoryList;
    }

    @Override
    public Integer addProductCategroy(ProductCategory productCategory) {
        return productCategoryMapper.insert(productCategory);
    }
}

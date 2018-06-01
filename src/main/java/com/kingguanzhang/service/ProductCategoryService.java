package com.kingguanzhang.service;

import com.kingguanzhang.pojo.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> getCategory();

    Integer addProductCategroy(ProductCategory productCategory);

    Integer editProductCategroy(ProductCategory productCategory);

    Integer deleteProductCategroy(Integer id);
}

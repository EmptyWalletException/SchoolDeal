package com.kingguanzhang.service;

import com.kingguanzhang.pojo.Product;

import java.io.InputStream;
import java.util.List;

public interface ProductService {

    public List<Product> getProductList(Integer shopId);

    Product getProduct(Integer productId);

    void addProduct(Product product, InputStream inputStream, String originalFilename);

    int updateProduct(Product product);

    Integer removeProduct(Integer productId);

    Integer shelveProduct(Integer productId);

    Integer unShelveProduct(Integer productId);

    List<Product> getShelveProductList(Integer shopId);

    List<Product> getUnShelveProduct(Integer shopId);
}

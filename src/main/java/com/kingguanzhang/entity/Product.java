package com.kingguanzhang.entity;

import java.util.Date;
import java.util.List;

/**
 * 商品
 */
public class Product {
    private Integer productId;
    private String productName;
    private Integer productCategoryId;
    private String productDesc;
    private String imgAddr;//商品的封面图;
    private String normalPrice;//平常价格;
    private Integer priority;
    private Date createTime;
    private Date editTime;
    private Integer enableStatus;//-1不可用,0下架,1正在展示,2审核中;

    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;

    public Product() {
    }

    public Product(Integer productId, String productName, Integer productCategoryId, String productDesc, String imgAddr, String normalPrice, Integer priority, Date createTime, Date editTime, Integer enableStatus, List<ProductImg> productImgList, ProductCategory productCategory, Shop shop) {

        this.productId = productId;
        this.productName = productName;
        this.productCategoryId = productCategoryId;
        this.productDesc = productDesc;
        this.imgAddr = imgAddr;
        this.normalPrice = normalPrice;
        this.priority = priority;
        this.createTime = createTime;
        this.editTime = editTime;
        this.enableStatus = enableStatus;
        this.productImgList = productImgList;
        this.productCategory = productCategory;
        this.shop = shop;
    }

    public Integer getProductId() {

        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}

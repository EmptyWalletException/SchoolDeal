package com.kingguanzhang.pojo;

import java.util.Date;

/*
 *   商品类别实体类
 */
public class ProductCategory {

    private Long productCategoryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;//权重
    private Date createTime;

    public ProductCategory() {
    }

    public ProductCategory(Long productCategoryId, Long shopId, String productCategoryName, Integer priority, Date createTime) {
        this.productCategoryId = productCategoryId;
        this.shopId = shopId;
        this.productCategoryName = productCategoryName;
        this.priority = priority;
        this.createTime = createTime;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
}

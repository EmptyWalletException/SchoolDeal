package com.kingguanzhang.pojo;

import java.util.Date;

public class WechatAuth {
    private Integer wechatAuthId;

    private String openId;

    private Date createTime;

    private Integer userId;

    public Integer getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Integer wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
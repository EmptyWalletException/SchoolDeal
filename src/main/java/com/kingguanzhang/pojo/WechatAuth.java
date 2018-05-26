package com.kingguanzhang.pojo;

import java.util.Date;

/**
 * 微信用户,和personInfo类关联
 */
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

    public WechatAuth() {
    }

    public WechatAuth(Long wechatAuthId, String openId, Date createTime, PersonInfo personInfo) {
        this.wechatAuthId = wechatAuthId;
        this.openId = openId;
        this.createTime = createTime;
        this.personInfo = personInfo;
    }

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}

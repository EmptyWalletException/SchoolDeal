package com.kingguanzhang.entity;

import java.util.Date;

/**
 * 本地帐户,一般与微信帐户二选一作为登录账号;
 */
public class LocalAuth {

    private Long localAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date editTime;
    private PersonInfo personInfo;

    public LocalAuth() {
    }

    public LocalAuth(Long localAuthId, String username, String password, Date createTime, Date editTime, PersonInfo personInfo) {
        this.localAuthId = localAuthId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.editTime = editTime;
        this.personInfo = personInfo;
    }

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}

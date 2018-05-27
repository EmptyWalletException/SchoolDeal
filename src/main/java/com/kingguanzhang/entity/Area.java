package com.kingguanzhang.entity;

import java.util.Date;

/**
 * 区域实体类
 */
public class Area {

    private Integer areaId;//区域id

    private String areaName;//区域名字

    private Integer priority;//权重,用于排序

    private Date createTime;//创建时间

    private Date editTime;//最后更新时间

    public Area() {
    }

    public Area(Integer areaId, String areaName, Integer priority, Date createTime, Date editTime) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.priority = priority;
        this.createTime = createTime;
        this.editTime = editTime;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
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
}

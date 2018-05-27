package com.kingguanzhang.dto;

import com.kingguanzhang.enums.ShopSateEnum;
import com.kingguanzhang.pojo.Shop;

import java.util.List;

public class ShopExecution {

    private int state;

    private String stateInfo;

    //店铺数量
    private int count;

    //操作的店铺,增删改的时候需要用到;
    private Shop shop;

    //查询的时候需要用到;
    private List<Shop> shopList;

    public ShopExecution() {

    }


    /**
     *店铺操作失败时的构造器,此构造器只更新了状态信息;
     *
     * @param stateEnum
     */
    public ShopExecution(ShopSateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /**
     * 店铺增删改操作成功时的构造器,此构造器会额外返回一个店铺;
     * @param stateEnum
     * @param shop
     */
    public ShopExecution(ShopSateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }

    /**
     * 店铺查询操作成功时的构造器,此构造器会额外返回一个店铺列表;
     * @param stateEnum
     * @param shopList
     */
    public ShopExecution(ShopSateEnum stateEnum, List<Shop> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;
    }


}

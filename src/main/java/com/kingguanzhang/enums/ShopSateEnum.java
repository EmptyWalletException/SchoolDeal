package com.kingguanzhang.enums;

/**
 * 预设的店铺信息枚举类,此类只对外公开get方法,关闭set方法和有参构造器,防止枚举元素被更改;
 */
public enum ShopSateEnum {

    CHECK(0, "店铺正在审核中"), OFFLINE(-1, "店铺审核未通过"), SUCCESS(1, "操作成功"), PASS(2, "店铺已经通过认证"), INNER_ERROR(-1001, "系统内部发生错误"),NULL_SHOP(-1003,"店铺信息为空");

    private int State;
    private String stateInfo;

    /**
     * 根据传入的state返回对应的enum值;例如传入0,则会返回"店铺正在审核中;
     *
     * @param state
     * @return
     */
    public static ShopSateEnum stateOf(int state) {
        for (ShopSateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    private ShopSateEnum(int state, String sateInfo) {
        this.State = state;
        this.stateInfo = sateInfo;
    }

    ShopSateEnum() {
    }

    public int getState() {
        return State;
    }


    public String getStateInfo() {
        return stateInfo;
    }


}

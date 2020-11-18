package com.mall.mallcommonservice.order.model;

import java.io.Serializable;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class OrderDetailReq implements Serializable {

    private static final long serialVersionUID = 6881761677119538296L;

    /**
     *
     * 会员ID
     */
    private String userId;

    /**
     *
     *
     * 订单号
     */
    private String orderNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}

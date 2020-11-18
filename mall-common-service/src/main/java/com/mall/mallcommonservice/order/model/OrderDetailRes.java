package com.mall.mallcommonservice.order.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class OrderDetailRes implements Serializable {

    private static final long serialVersionUID = 6881761677119538296L;


    /**
     *
     * 订单号
     */
    private String orderNo;

    /**
     *
     * 订单创建时间
     */
    private Date createTime;


    /**
     *
     * 订单总金额
     */
    private Double totalMoney;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }


}

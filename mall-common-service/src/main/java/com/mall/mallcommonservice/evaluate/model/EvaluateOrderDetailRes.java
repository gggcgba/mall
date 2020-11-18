package com.mall.mallcommonservice.evaluate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class EvaluateOrderDetailRes implements Serializable {

    private static final long serialVersionUID = 6881761677119538296L;


    /**
     *
     * 订单号
     */
    private String orderNo;

    /**
     *
     * 评论内容
     */
    private String content;


    /**
     *
     * 评论时间
     */
    private Date evaluateTime;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }
}

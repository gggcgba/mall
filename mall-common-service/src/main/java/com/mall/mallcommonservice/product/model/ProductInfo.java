package com.mall.mallcommonservice.product.model;

import java.io.Serializable;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 3779275407733692771L;
    /**
     *
     * 产品名称
     */
    private String name;

    /**
     *
     * 产品价格
     */
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

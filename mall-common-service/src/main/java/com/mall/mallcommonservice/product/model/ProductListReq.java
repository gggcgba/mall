package com.mall.mallcommonservice.product.model;

import java.io.Serializable;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class ProductListReq implements Serializable {

    private static final long serialVersionUID = 6881761677119538296L;

    /**
     *
     * 品类参数-例如鞋
     */
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

package com.mall.mallcommonservice.product.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public class ProductListRes implements Serializable {

    private static final long serialVersionUID = 6881761677119538296L;


    /**
     *
     * 产品返回列表数据
     */
    List<ProductInfo> productInfoList;


    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }
}

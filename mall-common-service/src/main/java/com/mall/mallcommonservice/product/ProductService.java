package com.mall.mallcommonservice.product;

import com.mall.mallcommonservice.product.model.ProductListReq;
import com.mall.mallcommonservice.product.model.ProductListRes;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public interface ProductService {

    /**
    * 功能描述:
    * 〈根据品类入参 查询产品列表数据〉
    * @param req 参数作用
    * @return : com.mall.mallcommonservice.product.model.ProductListRes
    * @author : gggcgba【wechat:13031016567】
    * @date : 2020/11/18 0018 16:13
    */
    ProductListRes queryProductList(ProductListReq req);
}

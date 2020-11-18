package com.mall.mallproduct.service;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.product.ProductService;
import com.mall.mallcommonservice.product.model.ProductInfo;
import com.mall.mallcommonservice.product.model.ProductListReq;
import com.mall.mallcommonservice.product.model.ProductListRes;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@Service(version = "1.0.0",interfaceClass = ProductService.class)
public class ProductServiceImpl implements ProductService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 功能描述:
     * 〈根据品类入参 查询产品列表数据〉
     * @param req 参数作用
     * @return : com.mall.mallcommonservice.product.model.ProductListRes
     * @author : gggcgba【wechat:13031016567】
     * @date : 2020/11/18 0018 16:13
     */
    @Override
    public ProductListRes queryProductList(ProductListReq req) {
        logger.info("ProductServiceImpl queryProductList req:{}", JSON.toJSONString(req));
        ProductListRes productListRes = new ProductListRes();
        List<ProductInfo> productInfoList = new ArrayList<>();
        ProductInfo productInfo1 = new ProductInfo();
        productInfo1.setName("耐克-1029");
        productInfo1.setPrice(566.45);
        ProductInfo productInfo2 = new ProductInfo();
        productInfo2.setName("新百伦-768");
        productInfo2.setPrice(345.32);
        productInfoList.add(productInfo1);
        productInfoList.add(productInfo2);
        productListRes.setProductInfoList(productInfoList);
        return productListRes;
    }
}

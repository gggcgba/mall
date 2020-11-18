package com.mall.mallcontroller.order;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.order.OrderService;
import com.mall.mallcommonservice.order.model.OrderDetailReq;
import com.mall.mallcommonservice.order.model.OrderDetailRes;
import com.mall.mallcommonservice.product.ProductService;
import com.mall.mallcommonservice.product.model.ProductListReq;
import com.mall.mallcommonservice.product.model.ProductListRes;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@RestController
public class OrderController {

    @Reference(version = "1.0.0")
    private OrderService orderService;

    @RequestMapping("/queryOrderDetail")
    public String queryOrderDetail(OrderDetailReq req){
        OrderDetailRes res = orderService.queryOrderDetail(req);
        return JSON.toJSONString(res);
    }
}

package com.mall.mallorder.service;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.order.OrderService;
import com.mall.mallcommonservice.order.model.OrderDetailReq;
import com.mall.mallcommonservice.order.model.OrderDetailRes;
import com.mall.mallcommonservice.product.ProductService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@Service(version = "1.0.0",interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 功能描述:
     * 〈根据订单号 查询订单详情〉
     * @param req 参数作用
     * @return : com.mall.mallcommonservice.order.model.OrderDetailRes
     * @author : gggcgba【wechat:13031016567】
     * @date : 2020/11/18 0018 16:43
     */
    @Override
    public OrderDetailRes queryOrderDetail(OrderDetailReq req) {
        logger.info("OrderServiceImpl queryOrderDetail req:{}", JSON.toJSONString(req));
        OrderDetailRes res = new OrderDetailRes();
        res.setCreateTime(new Date());
        res.setOrderNo("JD48586945");
        res.setTotalMoney(345.5);
        logger.info("OrderServiceImpl queryOrderDetail res orderNo:{} res:{}", req.getOrderNo(), JSON.toJSONString(res));
        return res;
    }
}

package com.mall.mallcommonservice.order;

import com.mall.mallcommonservice.order.model.OrderDetailReq;
import com.mall.mallcommonservice.order.model.OrderDetailRes;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public interface OrderService {

    /**
    * 功能描述:
    * 〈根据订单号 查询订单详情〉
    * @param req 参数作用
    * @return : com.mall.mallcommonservice.order.model.OrderDetailRes
    * @author : gggcgba【wechat:13031016567】
    * @date : 2020/11/18 0018 16:43
    */
    OrderDetailRes queryOrderDetail(OrderDetailReq req);
}

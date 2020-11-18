package com.mall.mallevaluate.service;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.evaluate.EvaluateService;
import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailReq;
import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailRes;
import com.mall.mallcommonservice.order.OrderService;
import com.mall.mallcommonservice.order.model.OrderDetailReq;
import com.mall.mallcommonservice.order.model.OrderDetailRes;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@Service(version = "1.0.0",interfaceClass = EvaluateService.class)
public class EvaluateServiceImpl implements EvaluateService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 功能描述:
     * 〈根据订单号 查询此订单的评论信息〉
     * @param req 参数作用
     * @return : com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailRes
     * @author : gggcgba【wechat:13031016567】
     * @date : 2020/11/18 0018 17:04
     */
    @Override
    public EvaluateOrderDetailRes queryEvaluateOrderDetail(EvaluateOrderDetailReq req) {
        logger.info("EvaluateServiceImpl queryEvaluateOrderDetail req:{}", JSON.toJSONString(req));
        EvaluateOrderDetailRes res = new EvaluateOrderDetailRes();
        res.setOrderNo("JD348347");
        res.setEvaluateTime(new Date());
        res.setContent("口罩收到了，发货迅速，每一个都是独立包装，白色的看起清爽，带子不会戴着耳朵疼，用的差不多会再次购买。");
        logger.info("EvaluateServiceImpl queryEvaluateOrderDetail res orderNo:{} res:{}", req.getOrderNo(), JSON.toJSONString(res));
        return res;
    }
}

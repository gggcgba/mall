package com.mall.mallcontroller.evaluate;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.evaluate.EvaluateService;
import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailReq;
import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailRes;
import com.mall.mallcommonservice.order.OrderService;
import com.mall.mallcommonservice.order.model.OrderDetailReq;
import com.mall.mallcommonservice.order.model.OrderDetailRes;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@RestController
public class EvaluateController {

    @Reference(version = "1.0.0")
    private EvaluateService evaluateService;

    @RequestMapping("/queryEvaluateOrderDetail")
    public String queryEvaluateOrderDetail(EvaluateOrderDetailReq req){
        EvaluateOrderDetailRes res = evaluateService.queryEvaluateOrderDetail(req);
        return JSON.toJSONString(res);
    }
}

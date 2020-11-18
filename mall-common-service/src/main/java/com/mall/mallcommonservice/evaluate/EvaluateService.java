package com.mall.mallcommonservice.evaluate;

import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailReq;
import com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailRes;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
public interface EvaluateService {

    /**
    * 功能描述:
    * 〈根据订单号 查询此订单的评论信息〉
    * @param req 参数作用
    * @return : com.mall.mallcommonservice.evaluate.model.EvaluateOrderDetailRes
    * @author : gggcgba【wechat:13031016567】
    * @date : 2020/11/18 0018 17:04
    */
    EvaluateOrderDetailRes queryEvaluateOrderDetail(EvaluateOrderDetailReq req);
}

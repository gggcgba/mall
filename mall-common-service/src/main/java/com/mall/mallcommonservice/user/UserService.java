package com.mall.mallcommonservice.user;

import com.mall.mallcommonservice.user.model.LoginReq;
import com.mall.mallcommonservice.user.model.LoginRes;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/7 0005
 **/
public interface UserService {

    /**
    * 功能描述:
    * 〈用户请求登录服务〉
    * @param req 参数作用
    * @return : com.mall.mallcommonservice.user.model.LoginRes
    * @author : gggcgba【wechat:13031016567】
    * @date : 2020/11/7 0005 17:38
    */
    LoginRes login(LoginReq req);

}

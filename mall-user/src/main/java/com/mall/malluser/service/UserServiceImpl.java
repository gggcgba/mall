package com.mall.malluser.service;

import com.mall.mallcommonservice.user.UserService;
import com.mall.mallcommonservice.user.model.LoginReq;
import com.mall.mallcommonservice.user.model.LoginRes;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/7 0005
 **/
@Service(version = "1.0.0",interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public LoginRes login(LoginReq req) {
        System.out.println("UserServiceImpl login");
        return null;
    }
}

package com.mall.mallcontroller.user;

import com.mall.mallcommonservice.user.UserService;
import com.mall.mallcommonservice.user.model.LoginReq;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/login")
    public String login(LoginReq req){
        userService.login(req);
        return "Login Success";
    }
}

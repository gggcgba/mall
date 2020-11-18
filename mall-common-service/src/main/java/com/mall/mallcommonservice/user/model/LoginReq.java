package com.mall.mallcommonservice.user.model;

import java.io.Serializable;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/7 0005
 **/
public class LoginReq implements Serializable {

    private static final long serialVersionUID = -220558748470729737L;

    /**
     *
     * 用户名
     */
    private String name;

    /**
     *
     * 密码
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

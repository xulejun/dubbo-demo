package com.xlj.service;

import com.xlj.bean.UserAddress;
import com.xlj.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 19:40
 *
 * dubbo本地存根：在调用提供者服务前，先调用本地存根对提供者服务做处理
 */

public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
    *传入的是UserService远程代理对象
    */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("本地存根UserServiceStub被调用");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}




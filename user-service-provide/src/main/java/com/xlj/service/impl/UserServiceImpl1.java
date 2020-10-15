package com.xlj.service.impl;

import com.xlj.bean.UserAddress;
import com.xlj.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:22
 *
 * 1.将服务提供者注册到服务注册中心
 * 2.服务消费者去服务注册中心订阅服务提供者的服务地址
 */

public class UserServiceImpl1 implements UserService {


    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl-----new");
        UserAddress userAddress = new UserAddress(1, "紫阳大厦", "001", "XLJ", "11428", "1");
        UserAddress userAddress1 = new UserAddress(2, "广阳小区", "002", "JYJ", "58332", "0");
        return Arrays.asList(userAddress,userAddress1);
    }
}

package com.xlj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xlj.bean.UserAddress;
import com.xlj.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:22
 *
 * 1.将服务提供者注册到服务注册中心
 * 2.服务消费者去服务注册中心订阅服务提供者的服务地址
 */

@Service        // 除去了配置中的接口暴露，dubbo下的@Service注解自动暴露服务
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress(1, "紫阳大厦", "001", "XLJ", "11428", "1");
        UserAddress userAddress1 = new UserAddress(2, "广阳小区", "002", "JYJ", "58332", "0");
        return Arrays.asList(userAddress,userAddress1);
    }
}

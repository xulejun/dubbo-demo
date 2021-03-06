package com.xlj.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xlj.bean.UserAddress;
import com.xlj.service.OrderService;
import com.xlj.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:55
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Reference(loadbalance = "random")  // dubbo远程调用该服务,负载均衡以随机的策略进行
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //  查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}

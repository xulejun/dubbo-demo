package com.xlj.service.impl;

import com.xlj.bean.UserAddress;
import com.xlj.service.OrderService;
import com.xlj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:55
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //  查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println("用户id"+userId);
        return addressList;
    }
}

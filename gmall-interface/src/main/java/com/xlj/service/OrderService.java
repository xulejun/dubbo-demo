package com.xlj.service;

import com.xlj.bean.UserAddress;

import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:53
 */

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}

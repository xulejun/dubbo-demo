package com.xlj.service;

import com.xlj.bean.UserAddress;

import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 11:21
 */

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}

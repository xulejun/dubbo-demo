package com.xlj;

import com.xlj.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 15:47
 */

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService bean = applicationContext.getBean(OrderService.class);

        bean.initOrder("1");

        System.in.read();
    }
}

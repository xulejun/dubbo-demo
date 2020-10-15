package com.xlj.config;

import com.alibaba.dubbo.config.*;
import com.xlj.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author XuLeJun
 * @Date 2020/7/14 20:07
 */


@Configuration
public class DubboConfig {

    //    dubbo.application.name=boot-user-provide
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-provide");
        return applicationConfig;
    }

    //    dubbo.registry.protocol=zookeeper dubbo.registry.address=127.0.0.1:2181
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    //    dubbo.protocol.name=dubbo dubbo.protocol.port=20880
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);

        // 配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        // 将method的设置关联到service配置中
        List<MethodConfig> list = new ArrayList<MethodConfig>();
        list.add(methodConfig);
        serviceConfig.setMethods(list);

        return serviceConfig;
    }

    //    dubbo.monitor.protocol=registry
    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }


}

package com.xlj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * springboot整合dubbo三种方式：
 *      1.导入dubbo-start，在application.properties配置属性，使用@Service暴露服务，@Reference引用服务
 *      2.保留dubbo.xml配置文件,@ImportResource(locations = "classpath:provide.xml")导入配置
 *      3.使用注解API的方式，将每一个组件手动创建到容器中(编写一个配置类),开启包扫描@EnableDubbo(scanBasePackages = "com.xlj")
 *
 */

//@ImportResource(locations = "classpath:consumer.xml")
//@EnableDubbo(scanBasePackages = "com.xlj")
@EnableDubbo    // 开启基于注解的dubbo功能
@SpringBootApplication
public class BootUserProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserProvideApplication.class, args);
    }

}

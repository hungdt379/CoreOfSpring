package com.example.coreofspring.javaconfig;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration // se khai bao mot hoac nhieu bean
@ComponentScan(basePackages = "com.example.coreofspring.javaconfig") // de biet vao package nao de qet annotation va tao bean
public class AppConfig {

    // cách khác là tạo thang bean trong config
    @Bean(name = "beanService") // tat cac cac method bean phai nam trong class Configuration
    //@Primary
    public MyServiceImpl myService(){
        return new MyServiceImpl();
    }
}

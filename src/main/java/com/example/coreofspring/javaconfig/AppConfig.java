package com.example.coreofspring.javaconfig;

import org.springframework.context.annotation.*;

@Configuration // se khai bao mot hoac nhieu bean
@ComponentScan(basePackages = "com.example.coreofspring.javaconfig") // de biet vao package nao de quet annotation va tao bean
public class AppConfig {

//    @Bean // tat cac cac method bean phai nam trong class Configuration
//    public MyServiceImpl myService(){
//        MyServiceImpl myService = new MyServiceImpl();
//        return myService;
//    }
}

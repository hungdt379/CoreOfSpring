package com.example.coreofspring.javaconfig;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.coreofspring.javaconfig")
public class AppConfig {

//    @Bean
//    public MyServiceImpl myService(){
//        MyServiceImpl myService = new MyServiceImpl();
//        return myService;
//    }
}

package com.example.coreofspring.javaconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Messenger implements InitializingBean, DisposableBean {
    @Autowired(required = true) // nếu spring container không tim thấy thì báo lỗi, required = false thì sẽ inject null
    @Qualifier("myMessageFromEmail")
    private MyService myService;

    @Override
    public String toString() {
        return "Messenger{" +
                "myService=" + myService +
                '}';
    }
    @PostConstruct
    public void afterContruct(){
        System.out.println("After construct bean");
    }

    @PreDestroy
    public void previousDestroy(){
        System.out.println("Previous destroy been");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
    }


}

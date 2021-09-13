package com.example.coreofspring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Messenger {
    @Autowired(required = true) // nếu spring container không tim thấy thì báo lỗi, required = false thì sẽ inject null
    @Qualifier("myMessageFromEmail")
    private MyService myService;

    @Override
    public String toString() {
        return "Messenger{" +
                "myService=" + myService +
                '}';
    }
}

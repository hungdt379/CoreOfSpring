package com.example.coreofspring.javaconfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {

    @Value("My name is Hưng")
    String message;

    public MyServiceImpl(String message) {
        this.message = message;
    }

    public MyServiceImpl() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyServiceImpl{" +
                "message='" + message + '\'' +
                '}';
    }
}

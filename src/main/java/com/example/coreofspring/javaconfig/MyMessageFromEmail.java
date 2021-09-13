package com.example.coreofspring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // tao thanh 1 bean
public class MyMessageFromEmail implements MyService {
    @Value("My message from email")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "MyMessageFromEmail{" +
                "message='" + message + '\'' +
                '}';
    }
}

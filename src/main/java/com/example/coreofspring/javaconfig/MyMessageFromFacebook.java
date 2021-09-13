package com.example.coreofspring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyMessageFromFacebook implements MyService{
    @Value("My message from facebook") // dat gia tri message
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
        return "MyMessageFromFacebook{" +
                "message='" + message + '\'' +
                '}';
    }
}

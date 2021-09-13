package com.example.coreofspring.javaconfig;

import org.springframework.stereotype.Component;

@Component
public interface MyService {
    String getMessage();

    void setMessage(String message);
}

package com.example.coreofspring.javaconfig;


public class MyServiceImpl implements MyService {

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

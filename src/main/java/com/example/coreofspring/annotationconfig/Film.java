package com.example.coreofspring.annotationconfig;


import org.springframework.beans.factory.annotation.Required;

public class Film {
    private String name;

    @Required
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }
}

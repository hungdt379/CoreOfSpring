package com.example.coreofspring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudioAutowiredConstructor {
    private String studioName;
    private Film film;

    @Autowired
    public StudioAutowiredConstructor(String studioName, Film film) {
        this.studioName = studioName;
        this.film = film;
    }

    @Override
    public String toString() {
        return "StudioAutowiredConstructor{" +
                "studioName='" + studioName + '\'' +
                ", film=" + film +
                '}';
    }
}

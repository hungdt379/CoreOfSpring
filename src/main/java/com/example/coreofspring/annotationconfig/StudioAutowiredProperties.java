package com.example.coreofspring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudioAutowiredProperties {

    private String studioName;

    @Autowired
    @Qualifier("setNameSpiderMan")
    private Film film;

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "StudioAutowiredProperties{" +
                "studioName='" + studioName + '\'' +
                ", film=" + film +
                '}';
    }
}

package com.example.coreofspring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudioAutowiredSetter {
    private String studioName;
    private Film film;

    public String getStudioName() {
        return studioName;
    }

    @Autowired
    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public Film getFilm() {
        return film;
    }

    @Autowired
    @Qualifier("setNameSpiderMan")
    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "StudioAutowiredSetter{" +
                "studioName='" + studioName + '\'' +
                ", film=" + film +
                '}';
    }
}

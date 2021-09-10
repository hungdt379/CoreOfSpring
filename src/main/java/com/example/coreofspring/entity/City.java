package com.example.coreofspring.entity;

public class City {
    private String name;
    private long population;
    private Country country;

    public City() {
    }

    public City(String name, long population, Country country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country=" + country.getName() +
                '}';
    }

}

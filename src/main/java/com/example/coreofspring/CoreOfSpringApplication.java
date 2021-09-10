package com.example.coreofspring;

import com.example.coreofspring.entity.City;
import com.example.coreofspring.entity.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoreOfSpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CoreOfSpringApplication.class, args);
        System.out.println("----XML-config----");
        ApplicationContext context = new ClassPathXmlApplicationContext("CountryContext.xml");
        Country countryIndia = (Country) context.getBean("india");
        System.out.println(countryIndia);
        Country countryVietnam = (Country) context.getBean("vietnam");
        System.out.println(countryVietnam);
        ApplicationContext contextCity = new ClassPathXmlApplicationContext("CityContext.xml");
        City cityHanoi = (City) contextCity.getBean("hanoian");
        System.out.println(cityHanoi);
    }

}

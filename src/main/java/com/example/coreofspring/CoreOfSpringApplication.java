package com.example.coreofspring;

import com.example.coreofspring.annotationconfig.Film;
import com.example.coreofspring.entity.City;
import com.example.coreofspring.entity.Country;
import com.example.coreofspring.javaconfig.AppConfig;
import com.example.coreofspring.javaconfig.MyService;
import com.example.coreofspring.javaconfig.MyServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoreOfSpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CoreOfSpringApplication.class, args);
//        System.out.println("----XML-config----");
//        ApplicationContext context = new ClassPathXmlApplicationContext("CountryContext.xml");
//        Country countryIndia = (Country) context.getBean("india");
//        System.out.println(countryIndia);
//        Country countryVietnam = (Country) context.getBean("vietnam");
//        System.out.println(countryVietnam);
//        ApplicationContext contextCity = new ClassPathXmlApplicationContext("CityContext.xml");
//        City cityHanoi = (City) contextCity.getBean("hanoian");
//        System.out.println(cityHanoi);

        System.out.println("----Java-config----");
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = javaContext.getBean(MyService.class);
        System.out.println(myService);

//        System.out.println("---Annotation-config---");
//        ApplicationContext annotationContext = new ClassPathXmlApplicationContext("AnnotationContext.xml");
//        Film film = (Film) annotationContext.getBean("setName");
//        System.out.println(film);
    }

}

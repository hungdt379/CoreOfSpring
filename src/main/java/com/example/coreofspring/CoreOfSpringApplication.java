package com.example.coreofspring;

import com.example.coreofspring.annotationconfig.Film;
import com.example.coreofspring.annotationconfig.StudioAutowiredConstructor;
import com.example.coreofspring.annotationconfig.StudioAutowiredProperties;
import com.example.coreofspring.annotationconfig.StudioAutowiredSetter;
import com.example.coreofspring.javaconfig.Messenger;
import com.example.coreofspring.xmlconfig.City;
import com.example.coreofspring.xmlconfig.Country;
import com.example.coreofspring.javaconfig.AppConfig;
import com.example.coreofspring.javaconfig.MyService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

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


        System.out.println("----Bean-Factory");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/CountryContext.xml"));

        System.out.println("----Java-config----");
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = javaContext.getBean(MyService.class);
        System.out.println(myService);
        Messenger messenger = javaContext.getBean(Messenger.class);
        System.out.println("---Qualifiers---");
        System.out.println(messenger);

        System.out.println("---Annotation-config---");
        ApplicationContext annotationContext = new ClassPathXmlApplicationContext("AnnotationContext.xml");
        Film film = (Film) annotationContext.getBean("setName"); // @Required
        System.out.println(film);

        // @Autowired
        StudioAutowiredConstructor studioAutowiredConstructor = (StudioAutowiredConstructor) annotationContext.getBean("constructorStudio");
        System.out.println(studioAutowiredConstructor);

        StudioAutowiredSetter studioAutowiredSetter = (StudioAutowiredSetter) annotationContext.getBean("setterStudio");
        System.out.println(studioAutowiredSetter);

        StudioAutowiredProperties studioAutowiredProperties = (StudioAutowiredProperties) annotationContext.getBean("propertiesStudio");
        System.out.println(studioAutowiredProperties);

    }

}

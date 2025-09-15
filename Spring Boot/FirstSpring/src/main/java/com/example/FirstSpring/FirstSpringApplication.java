package com.example.FirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstSpringApplication.class, args);

//        we have created the bean, and now we not need to make the object of class.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car car = (Car) context.getBean("lambo");
        car.speed();

	}

}

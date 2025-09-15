package com.laptops.LaptopDealerProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealerProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LaptopDealerProjectApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Scanner sc  = new Scanner(System.in);

        System.out.println("Choose the brand you want to buy:\n1. Dell\n2. MacBook\n3. Microsoft");
        int userSelectBrand = sc.nextInt();

        System.out.println("Chose the Processor you want\n1. i3\n2. i5\n3. i7");
        int userSelectProcessor = sc.nextInt();

        String beanId = "";

        switch (userSelectBrand){
            case 1:
                switch (userSelectProcessor){
                    case 1:beanId = "dellWithi3";
                    break;
                    case 2:beanId = "dellWithi5";
                    break;
                    case  3:beanId = "dellWithi7";
                    break;
                }
                break;
            case 2:
                switch (userSelectProcessor){
                    case 1:beanId = "macBookWithi3";
                        break;
                    case 2:beanId = "macBookWithi5";
                        break;
                    case  3:beanId = "macBookWithi7";
                        break;
                }
                break;
            case 3:
                switch (userSelectProcessor){
                    case 1:beanId = "microsoftWithi3";
                        break;
                    case 2:beanId = "microsoftWithi5";
                        break;
                    case  3:beanId = "microsoftWithi7";
                        break;
                }
                break;
        }

        Brand laptop  = (Brand) context.getBean(beanId);
        laptop.showDetails();
	}

}

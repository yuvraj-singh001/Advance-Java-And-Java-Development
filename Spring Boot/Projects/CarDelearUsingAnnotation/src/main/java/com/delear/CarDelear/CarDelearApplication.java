package com.delear.CarDelear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;
import java.util.Scanner;

//@SpringBootApplication
public class CarDelearApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarDelearApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.delear.CarDelear");
        Scanner sc = new Scanner(System.in);
        String beanId = "";


//        System.out.println("Select your car: \n1. Family Car \n2. Sports Car \n3. Cyber Truck \n");
//        int selectCar = sc.nextInt();
//        switch (selectCar){
//            case 1: beanId = "familycar";
//            break;
//            case 2: beanId = "sportscar";
//            break;
//            case 3: beanId = "cybertruck";
//            break;
//        }
//        Car car = (Car)context.getBean(beanId);
//        car.showCarDeatails();



        String yn = "y";
        while (Objects.equals(yn, "y")) {

            System.out.println("Select your car: \n1. Family Car \n2. Sports Car \n3. Cyber Truck \n");
            int selectCar = sc.nextInt();
            sc.nextLine();

            switch (selectCar) {
                case 1:
                    beanId = "familycar";
                    break;
                case 2:
                    beanId = "sportscar";
                    break;
                case 3:
                    beanId = "cybertruck";
                    break;
            }

            Car car = (Car) context.getBean(beanId);
            car.showCarDeatails();

            System.out.print("Do you want to continue? (y/n): ");
            yn = sc.nextLine();
        }
	}

}

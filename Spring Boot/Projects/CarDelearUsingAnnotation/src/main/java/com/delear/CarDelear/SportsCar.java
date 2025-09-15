package com.delear.CarDelear;

import org.springframework.stereotype.Component;

@Component("sportscar")
public class SportsCar implements Car{
    @Override
    public void showCarDeatails() {
        System.out.println("This is a Sports Car");
    }
}

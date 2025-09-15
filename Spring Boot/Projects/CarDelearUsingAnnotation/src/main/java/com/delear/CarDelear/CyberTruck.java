package com.delear.CarDelear;

import org.springframework.stereotype.Component;

@Component("cybertruck")
public class CyberTruck implements Car{
    @Override
    public void showCarDeatails() {
        System.out.println("This is Cyber Truck");
    }
}

package com.delear.CarDelear;

import org.springframework.stereotype.Component;

@Component("familycar")
public class FamilyCar implements Car{
    @Override
    public void showCarDeatails() {
        System.out.println("This is a Family Car");
    }
}

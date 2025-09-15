package com.laptops.LaptopDealerProject;

public class Microsoft implements Brand{

    Processor processor;
    public Microsoft(Processor processor){
        this.processor = processor;
    }

    @Override
    public void showDetails() {
        System.out.println("You hava selected Microsoft Laptop " + processor.showProcessorDetails());
    }
}

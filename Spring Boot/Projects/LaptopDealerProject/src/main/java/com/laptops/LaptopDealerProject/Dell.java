package com.laptops.LaptopDealerProject;

public class Dell implements Brand{

    Processor processor;
    public Dell(Processor processor){
        this.processor = processor;
    }

    @Override
    public void showDetails() {
        System.out.println("You have selected Dell Laptop " + processor.showProcessorDetails());
    }
}

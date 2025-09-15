package com.laptops.LaptopDealerProject;

public class MacBook implements Brand{

    Processor processor;
    public MacBook(Processor processor){
        this.processor = processor;
    }

    @Override
    public void showDetails() {
        System.out.println("You hava selected MacBook " + processor.showProcessorDetails());
    }
}

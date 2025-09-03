package com.yuvraj.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    one way to solve is to create object but we do different method.


//        Or use constructor
//        public Dev (Laptop laptop){
//        this.laptop = laptop;
//    }

//    setter injection we also need to use the autowire here.
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    //    we can connect both by using autowiring and it is called field injection.
    @Autowired
    @Qualifier("laptop") //to set laptop primary but we need small letter class name.
    private Computer comp;
    public void build(){
        comp.compile();
        System.out.println("working on awesome project");
    }
}
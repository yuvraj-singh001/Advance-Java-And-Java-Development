package com.yuvraj.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

//        we will first take the reference of the Dev class.
//        ApplicationContext context;

//        or
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

//        This will work, but it is not a good method here.
//        Dev o1 = new Dev();
//        o1.build();

//        so we do.
        Dev obj = context.getBean(Dev.class);
        obj.build();
	}

}

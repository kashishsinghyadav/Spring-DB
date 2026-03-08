package org.kashish.springdemo;

import org.kashish.springdemo.model.Alein;
import org.kashish.springdemo.model.Laptop;
import org.kashish.springdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

        LaptopService servive = context.getBean(LaptopService.class);
        Laptop laptop =context.getBean(Laptop.class);

        servive.addLaptop(laptop);
//        Alein obj =context.getBean(Alein.class);
//        obj.code();

    }

    

}

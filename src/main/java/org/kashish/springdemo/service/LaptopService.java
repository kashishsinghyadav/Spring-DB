package org.kashish.springdemo.service;

import org.kashish.springdemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop added");
    }


    public boolean isGoodForProg( Laptop laptop) {
       return true;
    }
}

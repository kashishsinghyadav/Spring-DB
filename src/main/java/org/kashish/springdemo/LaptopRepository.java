package org.kashish.springdemo;

import org.kashish.springdemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop l) {
        System.out.println("save to repository");
    }
}

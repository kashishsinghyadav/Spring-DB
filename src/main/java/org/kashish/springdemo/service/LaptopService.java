package org.kashish.springdemo.service;

import org.kashish.springdemo.repo.LaptopRepository;
import org.kashish.springdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }


    public boolean isGoodForProg( Laptop laptop) {
       return true;
    }
}

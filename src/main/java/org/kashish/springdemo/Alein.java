package org.kashish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alein {

    @Value("23")
    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Computer computer;
    @Autowired  // @Autowired is used for automatic dependency injection in Spring, allowing the Spring IoC container to automatically resolve and inject collaborating beans into a class.
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public  Computer getComputer() {
        return this.computer;
    }
    public void code(){
        System.out.println("the initial class");
    }
}

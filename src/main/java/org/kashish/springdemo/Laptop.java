package org.kashish.springdemo;

public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Laptop compiled");
    }
}

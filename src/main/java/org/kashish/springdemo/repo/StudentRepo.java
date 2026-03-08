package org.kashish.springdemo.repo;


import org.kashish.springdemo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    public void save(Student student) {
        System.out.println("Student saved");
    }

}

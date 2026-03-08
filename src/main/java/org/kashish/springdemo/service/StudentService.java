package org.kashish.springdemo.service;


import org.kashish.springdemo.model.Student;
import org.kashish.springdemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class StudentService {

    private final StudentRepo studentRepo;

//    @Autowired
//    public void setStudentRepo(StudentRepo studentRepo) {
//        this.studentRepo = studentRepo;
//    }
@Autowired
public StudentService(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
}

    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    public void getStudent(){
        System.out.println(studentRepo.findAll());
    }
}

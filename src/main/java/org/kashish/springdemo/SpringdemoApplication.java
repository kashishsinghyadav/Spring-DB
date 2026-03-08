package org.kashish.springdemo;

import org.kashish.springdemo.model.Student;
import org.kashish.springdemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

      Student student = context.getBean(Student.class);
        StudentService studentService = context.getBean(StudentService.class);
      student.setName("ashish");
      student.setAge(23);
      student.setGender("Female");

      studentService.addStudent(student);
        studentService.getStudent();

    }

    

}

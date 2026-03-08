package org.kashish.springdemo.repo;


import org.kashish.springdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {


    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void save(Student student) {
        String sql = "Insert into student (age,gender,name) values(?,?,?)";
      int row=  jdbcTemplate.update(sql,student.getAge(),student.getGender(),student.getName());
        System.out.println(row + "affected");
    }

}

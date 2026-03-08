package org.kashish.springdemo.repo;


import org.kashish.springdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<Student> findAll(){

        String sql ="select * from student";

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setAge(rs.getInt("age"));
//                s.setGender(rs.getString("gender"));
//                s.setName(rs.getString("name"));
//                return s;
//
//            }
//        };
        return   jdbcTemplate.query(sql,(rs,rowNum)->{
            Student s = new Student();
            s.setAge(rs.getInt("age"));
            s.setGender(rs.getString("gender"));
            s.setName(rs.getString("name"));
            return s;

        });
    }

}

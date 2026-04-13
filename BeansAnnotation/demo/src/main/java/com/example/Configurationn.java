package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurationn {
    @Bean(name="course1")
    public Course getCourse(){
        Course c=new Course();
        c.setCourseId(101);
        c.setCourseName("Java");

        return c;


    }
     @Bean(name="stud1")
    public Student getStudent(){
        Student s=new Student();
        s.setStudId(1);
        s.setName("John");
        

        return s;
    
}
}


package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurationn {

    @Bean(name = "stud1")
    public Student getStudent() {
        Student s = new Student();
        s.setSid(1);
        s.setSname("Jane");

        return s;
    }

    @Bean(name = "clg1")
    public College getCollege() {
        College c = new College();
        c.setCid(101);
        c.setColName("ABC College");

      

        return c;
    }
}
    


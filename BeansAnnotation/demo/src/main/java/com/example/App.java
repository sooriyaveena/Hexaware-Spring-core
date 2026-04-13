package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annot=new AnnotationConfigApplicationContext(Configurationn.class);
        Student s=(Student)annot.getBean("stud1");
        System.out.println(s);
        Course c=(Course)annot.getBean("course1");
        System.out.println(c);


    }
       
}

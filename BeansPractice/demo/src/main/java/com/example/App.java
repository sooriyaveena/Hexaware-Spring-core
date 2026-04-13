package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        /* 

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Patient p1 = context.getBean("pat1", Patient.class);

        System.out.println(p1);
        System.out.println("Doctor of patient: " + p1.getDoctor());

        */
       AnnotationConfigApplicationContext annt=new AnnotationConfigApplicationContext(Configurationn.class);
       Student s1=(Student) annt.getBean("stud1");
       System.out.println(s1);
       College c1=(College) annt.getBean("clg1");
       System.out.println(c1);

       System.out.println("Student Name: " + c1.getColName().toString());
        System.out.println("Marks: " + c1.getCid());

    }
}
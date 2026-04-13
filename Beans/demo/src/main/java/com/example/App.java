package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

    
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

      
        //Employee e1 = (Employee) context.getBean("emp1");

        
        //System.out.println(e1);

        //Department d1=(Department) context.getBean("dept1");
        
        //System.out.println(d1);

        

Student s1 = context.getBean("stud1", Student.class);
Student s2 = context.getBean("stud2", Student.class);

System.out.println(s1);
System.out.println(s1.getCourse());

System.out.println(s2);
System.out.println(s2.getCourse());
        //Employee e1 = (Employee) context.getBean("emp1");
        //System.out.println(e1);                      
        //System.out.println(e1.getDepartment()); 
    }
}
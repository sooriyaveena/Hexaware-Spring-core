package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studId;
    private String name;

    @Autowired
    private Course course;   

    public Student() {
    }

    public Student(int studId, String name, Course course) {
        this.studId = studId;
        this.name = name;
        this.course = course;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [studId=" + studId +
               ", name=" + name +
               ", course=" + course + "]";
    }
}
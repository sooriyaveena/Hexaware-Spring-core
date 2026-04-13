
package com.example;

public class Department {

    private int deptId;
    private String deptName;
    private String location;

    // Default constructor
    public Department() {
    }

    // Parameterized constructor
    public Department(int deptId, String deptName, String location) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.location = location;
    }

    // Getters & Setters
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString
    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
    }
}
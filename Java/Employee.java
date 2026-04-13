
    /*
    🧑‍💼 Java Assignment: Abstract Class – Employee
🔹 Basic Questions
Create an abstract class Employee with:
Data members: empId, name
One abstract method: calculateSalary()
Create a child class TemporaryEmployee:
Data members: hoursWorked, ratePerHour
Implement calculateSalary()
Create a child class PermanentEmployee:
Data members: basicSalary, bonus
Implement calculateSalary()
Create objects of both classes and call calculateSalary().
🔹 Intermediate Questions
Create a menu-driven program:
Add Temporary Employee
Add Permanent Employee
Calculate Salary
Display Details
Exit
Store all employees in an Array/List.
Use runtime polymorphism to call calculateSalary().
Add a method to display employee details.
Allow user to search employee by empId.
Allow user to update employee salary details.
    */

import java.util.Scanner;

abstract class Employee {
int empId;
String name;

Employee(int empId,String name){
    this.empId=empId;
    this.name=name;
}

public abstract  int  calculateSalary();

public void display() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + calculateSalary());
    }

    public int getEmpId() {
        return empId;
    }

    abstract void updateSalary(Scanner sc);
}

    


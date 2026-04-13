import java.util.Scanner;

class TemporaryEmployee extends Employee {
 /*
 
 Create a child class TemporaryEmployee:
Data members: hoursWorked, ratePerHour
Implement calculateSalary()
 
 */   

int hoursWorked;
int ratePerHour;

TemporaryEmployee(int empId, String name, int hoursWorked, int ratePerHour) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }


@Override
public int calculateSalary() {
    
    return hoursWorked*ratePerHour;
}

@Override
public void display() {
   
    

    System.out.println(  "Type : Temporary");
     System.out.println("Employee Id : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + calculateSalary());
        System.out.println(  "Hours Worked : " + hoursWorked);
        System.out.println("Rate/Hour: " + ratePerHour);
    }

    public void updateSalary(Scanner sc) {
    System.out.println("Enter hours:");
    hoursWorked = sc.nextInt();

    System.out.println("Enter rate:");
    ratePerHour = sc.nextInt();
}
}



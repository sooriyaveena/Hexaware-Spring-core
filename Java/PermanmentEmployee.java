import java.util.Scanner;

public class PermanmentEmployee extends Employee {
    int basicSalary;
    int bouns;

    public PermanmentEmployee(int empId,String name,int basicSalary,int bouns) {
        super(empId, name);
        this.empId=empId;
        this.name=name;


    }

    @Override
    public int calculateSalary() {
        
        return basicSalary+bouns;
    }
    public void display() {
        System.out.println("Type : Permanent");
        System.out.println("Employee Id: " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Basic Sala: " + basicSalary);
        System.out.println("Bonus       : " + bouns);
    }
    public void updateSalary(Scanner sc) {
    System.out.println("Enter basic salary:");
    basicSalary = sc.nextInt();

    System.out.println("Enter bonus:");
    bouns = sc.nextInt();
}
    



    
    
}

import java.util.*;
public class MainDriver {
    public static void main(String[] args) {
        TemporaryEmployee t=new TemporaryEmployee(123,"Raj", 8, 4);
         PermanmentEmployee p=new PermanmentEmployee(124,"Paul" , 400000,200000);

         ArrayList<Employee> list=new ArrayList<>();

         list.add(t);
         list.add(p);

         while (true) {

    System.out.println("1.Add Temporary Employee");
    System.out.println("2.Add Permanent Employee");
    System.out.println("3.Display All");
    System.out.println("4.Search by ID");
    System.out.println("5.Update Salary");
    System.out.println("6.Exit");

    Scanner sc=new Scanner(System.in);

    int choice = sc.nextInt();

    switch (choice) {

        case 1:
            System.out.println("Enter ID:");
            int id1 = sc.nextInt();

            System.out.println("Enter Name:");
            String name1 = sc.next();

            System.out.println("Enter Hours Worked:");
            int h = sc.nextInt();

            System.out.println("Enter Rate Per Hour:");
            int r = sc.nextInt();

            TemporaryEmployee t1= new TemporaryEmployee(id1, name1, h, r);
            list.add(t1);
            break;

        case 2:
            System.out.println("Enter ID:");
            int id2 = sc.nextInt();

            System.out.println("Enter Name:");
            String name2 = sc.next();

            System.out.println("Enter Basic Salary:");
            int bs = sc.nextInt();

            System.out.println("Enter Bonus:");
            int b = sc.nextInt();

            PermanmentEmployee p1 = new PermanmentEmployee(id2, name2, bs, b);
            list.add(p1);
            break;

        case 3:
            for (Employee e : list) {
                e.display();
                System.out.println("------------------");
            }
            break;

        case 4:
            System.out.println("Enter ID to search:");
            int eid = sc.nextInt();
            boolean found = false;

            for (Employee e : list) {
                if (e.empId == eid) {
                    e.display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found");
            }
            break;

        case 5:
            System.out.println("Enter ID to update:");
            int uid = sc.nextInt();

            for (Employee e : list) {

                if (e.empId == uid) {
                        e.updateSalary(sc);
                    

                    System.out.println("Updated Successfully");
                    break;
                }
            }
            break;

        case 6:
            System.out.println("Exiting...");
            return;

        default:
            System.out.println("Invalid choice");
    }
}


    }
    
}

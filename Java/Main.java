import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static ArrayList<Bank> customers = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balance");
            System.out.println("5.Transfer");
            System.out.println("6.Search Customer");
            System.out.println("7.Display All");
            System.out.println("8.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    if (findCustomer(accNo) != null) {
                        System.out.println("Account Already Exists");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Type: ");
                    String accountType = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    if (balance < 0) {
                        System.out.println("Invalid Balance");
                        break;
                    }

                    customers.add(new Bank(accNo, name, balance, accountType, email));
                    System.out.println("Account Created Successfully");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    Bank cust = findCustomer(accNo);
                    if (cust != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (amt <= 0) {
                            System.out.println("Invalid Amount");
                        } else {
                            cust.deposit(amt);
                        }
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    cust = findCustomer(accNo);
                    if (cust != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (amt <= 0) {
                            System.out.println("Invalid Amount");
                        } else {
                            cust.withdraw(amt);
                        }
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    cust = findCustomer(accNo);
                    if (cust != null) {
                        cust.display();
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter From Account: ");
                    int from = sc.nextInt();

                    System.out.print("Enter To Account: ");
                    int to = sc.nextInt();

                    if (from == to) {
                        System.out.println("Cannot Transfer to Same Account");
                        break;
                    }

                    Bank sender = findCustomer(from);
                    Bank receiver = findCustomer(to);

                    if (sender != null && receiver != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (amt <= 0) {
                            System.out.println("Invalid Amount");
                        } else if (sender.withdrawTransfer(amt)) {
                            receiver.deposit(amt);
                            System.out.println("Transfer Successful");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                    } else {
                        System.out.println("Invalid Accounts");
                    }
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    cust = findCustomer(accNo);
                    if (cust != null) {
                        cust.display();
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 7:
                    if (customers.isEmpty()) {
                        System.out.println("No Customers");
                    } else {
                        for (Bank c : customers) {
                            c.display();
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // 🔍 SEARCH METHOD
    static Bank findCustomer(int accNo) {
        for (Bank c : customers) {
            if (c.getAccNumber() == accNo) {
                return c;
            }
        }
        return null;
    }
}
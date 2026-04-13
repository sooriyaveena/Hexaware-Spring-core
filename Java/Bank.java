public class Bank {

    static int accountNumber;   

    private int id;             
    private String name;
    private double balance;   // FIXED
    private String accountType;
    private String email;

    public Bank(int accountNumber, String name, double balance, String accountType, String email) {

        Bank.accountNumber = accountNumber;  
        this.id = accountNumber;             

        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
        this.email = email;
    }

    public int getAccNumber() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Successfully");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public boolean withdrawTransfer(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    void display() {
        System.out.println("Account No: " + id);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Email : " + email);
    }
}
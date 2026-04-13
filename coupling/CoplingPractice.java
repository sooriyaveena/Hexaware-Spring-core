package com.example.demo.coupling;

interface Payment {
    void pay();
}

class DebitCard implements Payment {
    public void pay() {
        System.out.println("Payed using debitcard");
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("Payed using cash");
    }

}
class creditCard implements Payment{
    public void pay(){
        System.out.println("Payed using Creditcard");
    }

}
/* */
class PaymentMethod {
    Payment p;
    PaymentMethod(Payment p) {
        this.p = p;
    }

    void payy() {
        p.pay();
    }
}

public class CoplingPractice {
    public static void main(String[] args) {
        PaymentMethod p = new PaymentMethod(new DebitCard());
        p.payy();
        PaymentMethod p2=new PaymentMethod(new Cash());
        p2.payy();
        PaymentMethod p3=new PaymentMethod(new creditCard());
        p3.payy();


        

       
    }
}

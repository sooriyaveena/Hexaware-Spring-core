package com.hexaware.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.hexaware.dao.ProductDaoImpl;
import com.hexaware.dto.Product;

public class ProductService {

    ProductDaoImpl dao = new ProductDaoImpl();
    Scanner sc = new Scanner(System.in); // better: one scanner

    public void insert() {

        try {
            System.out.println("Enter Product ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Product Name:");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty");
                return;
            }

            System.out.println("Enter Price:");
            double price = sc.nextDouble();
            sc.nextLine();

            if (price <= 0) {
                System.out.println("Invalid price");
                return;
            }

            System.out.println("Enter City:");
            String city = sc.nextLine();

            Product p = new Product(id, name, price, city);
            dao.saveData(p);
            dao.showdata();
           

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type");
            sc.nextLine(); 
        }
    }
  
    public void delete() {

    

    System.out.println("Enter Product ID to delete:");
    int id = sc.nextInt();

    dao.deleteRow(id);
}
public  void update(){
    System.out.println("enter the city name to update");
    String city=sc.next();

    System.out.println("Enter the id for update");
    int id=sc.nextInt();
    sc.nextLine();
    dao.updateValue(city, id);


}
}
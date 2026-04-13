package com.hexaware;

import java.sql.Connection;

import com.hexaware.dao.ProductDaoImpl;
import com.hexaware.service.ProductService;


public class App
{

    public static void main(String[] args) {

        ProductDaoImpl dao = new ProductDaoImpl();
        Connection con = dao.getConnection();

        try {
            if (con != null && !con.isClosed()) {
                System.out.println("Connection Successful");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        ProductService ps=new ProductService();
        //ps.insert();
        
        //ps.delete();
        ps.update();

        
        


    

    }
}
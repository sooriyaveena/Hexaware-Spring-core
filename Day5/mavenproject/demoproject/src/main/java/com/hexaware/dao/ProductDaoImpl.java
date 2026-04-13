package com.hexaware.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.dto.Product;

public class ProductDaoImpl implements productDao{
    Connection con;

    public ProductDaoImpl() {
        try {

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hexaware1", "root", "root@123");

            if (con != null && !con.isClosed()) {
                System.out.println("Connected Successfully");
            }

        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
    }
    public Connection getConnection() {
    return con;
}
  PreparedStatement stmt;
	
		
	
@Override
public void saveData(Product p) {




    try
		{
			
			  stmt=con.prepareStatement("insert into product values (?,?,?,?) ");
			  stmt.setInt(1,p.getId());
			  stmt.setString(2,p.getName());
 
			  stmt.setDouble(3,p.getPrice());
 
			  stmt.setString(4,p.getCity());
			  int c=stmt.executeUpdate();
			  if(c>0)
			  {
				  System.out.println("saved ");
			  }
			  else
			  {
				  System.out.println("error ");
			  }
 
 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
    
    
}
@Override
public List<Product> showdata() { {

    List<Product> products = new ArrayList<>();
    String query = "select * from product";

    try {
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Product p = new Product(
                rs.getInt(1),
                rs.getString(2),
                rs.getDouble(3),
                rs.getString(4)
            );
            products.add(p);
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return products;
}

		
}
@Override
public void deleteRow(int id) {
    String sql="delete from product where id=?";

    try {
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        int rows=ps.executeUpdate();
        if(rows>0){
            System.out.println("Rows deleted");

        }
        else{
            System.out.println("Not deleted");
        }
        
    } catch (Exception e) {
        e.getMessage();
    }
}
@Override
public void updateValue(String city,int id) {
    String sql="update product set city=? where id=?";
    try {
        PreparedStatement ps=con.prepareStatement(sql);
         ps.setString(1, city); 
        ps.setInt(2, id);
        int rows=ps.executeUpdate();
        if(rows>0){
            System.out.println("Rows updated");

        }
        else{
            System.out.println("Not updated");
        }

           
    } catch (Exception e) {
    }
    
}
}
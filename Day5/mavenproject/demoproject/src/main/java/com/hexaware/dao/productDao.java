package com.hexaware.dao;
import java.util.List;

import com.hexaware.dto.Product;
public interface productDao {
    public void saveData(Product p);
    public List<Product> showdata();
    public void deleteRow(int id);
    public void updateValue(String city,int id);

    
}

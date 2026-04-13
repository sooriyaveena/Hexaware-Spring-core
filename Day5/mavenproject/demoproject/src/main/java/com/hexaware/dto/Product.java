package com.hexaware.dto;

public class Product {

    private int id;
    private String name;
    private double price;
    private String city;
    
    public Product(int id, String name, double price, String city) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", city=").append(city);
        sb.append('}');
        return sb.toString();
    }

    
}

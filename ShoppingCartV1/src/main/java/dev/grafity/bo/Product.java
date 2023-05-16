package dev.grafity.bo;

public class Product {
    public String name;
    public double price;
    public String category;

    public Product() {
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

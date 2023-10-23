package store.entities;


import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double price;
    private int qty;
    private String status;

    public Product (String productName, double price, int qty, String status) {
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.status = "Available";
        List<Product> products = new ArrayList<>();
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty (int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    public void setCategory(String category) {
    }



    @Override
    public String toString() {
        return "Product {" +
                "name='" + productName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", status=" + status +
       '}';
    }
}


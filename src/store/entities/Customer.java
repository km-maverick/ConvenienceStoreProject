package store.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private String customerEmail;
    private int customerPhoneNo;

    private List<Product> cart = new ArrayList<>();

    public Customer() {

    }

    public Customer(String customerName, String customerEmail, int customerPhoneNo) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(int customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public List<Product> getCart() {
        return cart;
    }

    public  void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void buyProduct(Product product) {
    }
}

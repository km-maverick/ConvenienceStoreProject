package store;

import store.entities.*;

public class Store {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 20202918);
        Cashier cashier = new Cashier("Alice", 67463822);
        Product product = new Product("Bread", 700);
        Customer customer = new Customer("Bob");
    }
}

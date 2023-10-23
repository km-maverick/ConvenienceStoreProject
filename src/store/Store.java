package store;

import store.entities.Cashier;
import store.entities.Customer;
import store.entities.Manager;
import store.entities.Product;

public class Store {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 1, "johsan@store.com", 225468);
        Cashier cashier = new Cashier("Alice", 2, "alice@yahoo.com", 7855536);
        Product product = new Product("Bread", 2.99, 70, "Available");
        Customer customer = new Customer("Bob", "boobb@yahoo", 7787896);

        manager.hireCashier(cashier);
        cashier.sellProduct(product, customer);
        customer.buyProduct(product);
    }
}
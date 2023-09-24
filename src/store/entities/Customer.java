package store.entities;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void buyProduct(Product product) {
        // method to buy product
        System.out.println("i have just purchased an item from the neighborhood store");
    }
}

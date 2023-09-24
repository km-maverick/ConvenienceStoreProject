package store.entities;

public class Cashier extends Staff {
    public Cashier(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
        System.out.println("As a Cashier, I handle sales");

    }

    public static void sellProduct(Product product, Customer customer) {
        //method to sell a product
        System.out.println("new product has been sold");
    }

}

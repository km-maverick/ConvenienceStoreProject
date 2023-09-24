package store.entities;

public class Manager extends Staff {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
            System.out.println("As a manager, I manage the store");

    }

    public static void hireCashier(Cashier cashier) {
        // method to hire new cashier
        System.out.println( "cashier has been hired" );
    }

}

package store.entities;

// declare parent class
public  abstract class Staff {
    private String name;
    private int employeeId;

    public Staff(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    //common method for all staff
    public void greet() {
        System.out.println("Hello, I am " + this.name + "I love working in the friendly neighborhood store");
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuties( );

}

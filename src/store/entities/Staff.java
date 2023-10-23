package store.entities;

// declare parent class
public  abstract class Staff {
    private String name;
    private int employeeId;
    private String email;
    private int phoneNo;

    public Staff(String name, int employeeId, String email, int phoneNo) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNo(){
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    //common method for all staff
    public void greet() {
        System.out.println("Hello, I am " + this.name + "I love working in the friendly neighborhood store");
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuties( );

    
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", idNo='" + employeeId + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +

                '}';
        }
    }


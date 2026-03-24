package za.ac.cput;

public class Employee {
    protected String name;
    protected String surname;
    protected String salary;
    protected Laptop laptopType;

    public Employee(String name, String surname, String salary, Laptop laptopType){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.laptopType = laptopType;
     }
     public void employeeDetails(){
         System.out.println("I am an employee and my name is " + name);
         laptopType.showLaptop();
     }
}

package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell");
        Laptop l2 = new Laptop("Mac");
        Employee e1 = new Employee("Samukelo", "Ndlela", "50000", l1);
        Employee e2 = new Employee("Andre", "Gime", "60000", l2);

        e1.employeeDetails();
        e2.employeeDetails();
        System.out.println("first print");
        System.out.println("second print");
        System.out.println("third print");
        System.out.println("fourth print");
        System.out.println("Heyyy for the fun of it");

    }
}
package za.ac.cput;

public class Laptop {
    protected String laptopType;

    public Laptop(String laptopType){
        this.laptopType = laptopType;
    }
    public void showLaptop(){
        System.out.println("The laptop I have is a " + laptopType);
    }
}

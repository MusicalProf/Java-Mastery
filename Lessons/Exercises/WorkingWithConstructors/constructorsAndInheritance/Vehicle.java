package Exercises.WorkingWithConstructors.constructorsAndInheritance;

public class Vehicle {
    // Create a class hierarchy with three levels and use constructors to initialize fields at each level.
    private String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

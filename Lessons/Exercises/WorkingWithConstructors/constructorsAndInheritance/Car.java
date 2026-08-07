package Exercises.WorkingWithConstructors.constructorsAndInheritance;

public class Car extends Vehicle{
    // Create a class hierarchy with three levels and use constructors to initialize fields at each level.
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

package Exercises.WorkingWithConstructors.constructorsAndInheritance;

public class ConstructorsInheritanceExample {
    // Create a class hierarchy with three levels and use constructors to initialize fields at each level.
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Lucid", "Air", 10000);
        System.out.println("Brand of car: " + electricCar.getBrand() + "\nModel of car: " + electricCar.getModel()
        + "\nBattery capacity: " + electricCar.getBatteryCapacity() + "KWH");
    }
}

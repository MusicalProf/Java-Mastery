package Exercises.WorkingWithConstructors.constructorsAndInheritance;

public class ElectricCar extends Car{
    // Create a class hierarchy with three levels and use constructors to initialize fields at each level.
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

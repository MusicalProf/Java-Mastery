package Notes.interfaces;

public abstract class Animal {
    // Abstract classes cannot be instantiated directly.
    private double weight;

    public void eat(){
        System.out.println("Animal eating.");
    }

    public abstract void breathe();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // When a class inherits from this abstract class, it must implement the abstract methods.
    // However, abstract classes can also have unimplemented methods. Usually the concrete methods are not implemented.
    // If an abstract method cannot be implemented yet, the child class needs to be made abstract.
}

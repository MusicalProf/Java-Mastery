package Exercises.ObjectsPractice.ObjectContainingOtherObjects;

public class Main {
    public static void main(String[] args) {
        //Create a Car class that contains a Person object representing the owner.
        Person person = new Person();
        person.name = "John B Good";

        Car car = new Car();
        car.model = "Hidden Tesla";
        car.owner = person;

        System.out.println("Model: " + car.model);
        System.out.println("Owner: " + car.owner.name);
    }
}

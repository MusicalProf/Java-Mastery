package Exercises.WorkingWithConstructors.superAndThis;

public class SuperThisExample {
    public static void main(String[] args) {
        // Create a class hierarchy with two levels and use super() and this() in the constructors to initialize fields.
        Dog scooby = new Dog("Canine", 41, "Bloodhound");
        Dog jimmy = new Dog();
        System.out.println("Species: " + scooby.getSpecies() + " Age: " + scooby.getAge()
                + " Breed: " + scooby.getBreed());
        System.out.println("Species: " + jimmy.getSpecies() + " Age: " + jimmy.getAge()
                + " Breed: " + jimmy.getBreed());

    }
}

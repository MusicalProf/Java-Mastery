package Exercises.WorkingWithConstructors.superAndThis;

public class Dog extends Animal{
    // Create a class hierarchy with two levels and use super() and this() in the constructors to initialize fields.
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public Dog(){
        this("Canine", 35, "German Shepard");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

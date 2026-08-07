package Exercises.WorkingWithConstructors.superAndThis;

public class Animal {
    // Create a class hierarchy with two levels and use super() and this() in the constructors to initialize fields.
    private String species;
    private int age;

    public Animal(String species, int age){
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

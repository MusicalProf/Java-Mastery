package exercises.accessModifiersAndStatic.FixTheProblem.Main;

import exercises.accessModifiersAndStatic.FixTheProblem.Animals.Animal;

public class Dog extends Animal {
    public static void printSpecies() {
        System.out.println(species); // This works because species is protected and default. It will also work if Dog
        // was added to the "animals" package.
    }
}

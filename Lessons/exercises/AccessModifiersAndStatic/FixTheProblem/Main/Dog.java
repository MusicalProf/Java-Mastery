package exercises.AccessModifiersAndStatic.FixTheProblem.Main;

import exercises.AccessModifiersAndStatic.FixTheProblem.Animals.Animal;

public class Dog extends Animal {
    public static void printSpecies() {
        System.out.println(species); // This works because species is protected and default. It will also work if Dog
        // was added to the "animals" package.
    }
}

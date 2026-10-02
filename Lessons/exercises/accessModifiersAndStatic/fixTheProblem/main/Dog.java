package exercises.accessModifiersAndStatic.fixTheProblem.main;

import exercises.accessModifiersAndStatic.fixTheProblem.animals.Animal;

public class Dog extends Animal {
    public static void printSpecies() {
        System.out.println(species); // This works because species is protected and default. It will also work if Dog
        // was added to the "animals" package.
    }
}

package Exercises.ObjectsPractice.PredictOutput;

public class Main {
    public static void main(String[] args) {
        // Predict the output of the given code snippet, which involves passing an object to a method and altering it.
        Person person = new Person();
        person.name = "John";
        person.age = 25;

        System.out.println("Before: " + person.name + ", " + person.age); // person.name = John, person.age = 25
        updatePerson(person);
        System.out.println("After: " + person.name + ", " + person.age); // person.name = Jane, person.age = 30
    }

    public static void updatePerson(Person p){
        p.name = "Jane";
        p.age = 30;
    }
}

class Person {
    String name;
    int age;
}

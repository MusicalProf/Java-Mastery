package Exercises.ObjectsPractice.SimpleObjectWithPrimitives;

public class Main{
    public static void main(String[] args) {
        // Create a simple Person class containing primitive data types and print the values.
        Person person = new Person();
        person.name = "James B. Grady";
        person.age = 25;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}


package Exercises.ObjectsPractice.PassObjectToMethod;

public class Main {
    public static void main(String[] args) {
        // Pass an object to a method, modify its fields, and print the values before and after the method call.
        Person person = new Person();
        person.name = "Jane Doe";
        person.age = 32;

        System.out.println("Original Name: " + person.name);
        System.out.println("Original Age: " + person.age);

        modifyPerson(person);
        System.out.println("New Name: " + person.name);
        System.out.println("New Age: " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Holly Wood Wilson";
        p.age = 57;
    }
}

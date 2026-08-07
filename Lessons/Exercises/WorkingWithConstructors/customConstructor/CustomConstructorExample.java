package Exercises.WorkingWithConstructors.customConstructor;

public class CustomConstructorExample {
    public static void main(String[] args) {
        // Create a class named Person with a custom constructor that takes a name and age as arguments.
        Person person = new Person("James", 41);
        System.out.println("This person's name is " + person.getName()
                + " and they are " + person.getAge() + " years old.");
    }
}

package Notes.OOP;

public class App {
    public static void main(String[] args) {
        // Inheritance - Ability of a class to inherit properties and methods from a Parent class. Is-A relationship.
        // Object composition is a Has-A relationship.
        // Encapsulation - Keeping fields and methods within the class itself, and shield from outside classes. Allows
        // easy maintainability and modularity.
        // Abstraction - Simplifying complex systems by focusing on the essential features and hiding away the
        // unnecessary details. The class gives enough information to use it, without the extra fluff.
        // Polymorphism - "Many Shapes/Forms". Allows for a class to have many different names, fields, and methods.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal cow = new Cow(); // Polymorphism allows for this to work, but we won't have access to any cow methods.
        dog.name = "Butch"; // Because dog extends Animal, it has access to name.
        cat.name = "Oliver";
        cat.setAge(6); // Because of encapsulation, we set the private field using the setter.

        dog.eat(); // Also has access to eat.
        dog.eat("meat");
        cat.eat();

        dog.bark();
        //cow.moo(); // This will not work due to cow being of Animal. It only has access to Animal methods.

        System.out.println(Dog.type); // Hiding - static members with the same name in the child classes.
        System.out.println(Cat.type);
    }
}

package Notes.interfaces;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // This will not work as Animal is abstract.
        Animal fox = new Fox(); // This will work as Fox is a child class of animal.
        Fox fox1 = new Fox();

        fox1.catchAndEat();
        fox1.run();
        Predator.staticMethod(); // Example of a private method implementation.
    }
}

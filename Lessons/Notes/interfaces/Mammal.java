package Notes.interfaces;

// Should a class be made final, it cannot be extended.
public class Mammal extends Animal{
    final int age = 10; // Because this variable is final, it can only have one assigned value.
    // Should a method be final, it means it cannot be overridden in the child class.
    public void breathe() {
        System.out.println("Mammal is breathing.");
    }
}

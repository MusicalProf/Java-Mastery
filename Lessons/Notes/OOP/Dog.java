package Notes.OOP;

public class Dog extends Animal{
    public static String type = "Dog";

    // @Override - This will make sure the method is being overridden.
    public void eat(){ // This method is overriding the implementation from the Parent class.
        System.out.println("Dog is eating.");
    }

    public void eat(String food){
        System.out.println("Dog is eating: " + food + ".");
    }

    public void bark() {
        System.out.println("BARK BARK!");
    }
}

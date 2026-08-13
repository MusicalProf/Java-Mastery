package Notes.interfaces;

public class Fox extends Mammal implements Predator, Prey{
    @Override
    public void catchAndEat() {
        System.out.println("Fox has caught and eaten some prey.");
    }

    @Override
    public void runAndHide() {
        System.out.println("Running and hiding from a predator.");
    }

    // This method was conflicting, and it was only resolved by providing an implementation for the conflicting method.
    @Override
    public void run() {
        System.out.println("Fox is running.");
    }
}

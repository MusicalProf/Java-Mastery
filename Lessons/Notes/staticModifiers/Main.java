package Notes.staticModifiers;

public class Main {
    public static void main(String[] args) {
        double pi = MathUtils.pi; // An instance of the class doesn't need to be created. It can just be called.
        System.out.println(pi);

        double result = MathUtils.subtract(10, 4);
        System.out.println(result);

        MathUtils m = new MathUtils(); // This works, but it's not suggested practice.
        System.out.println(m.pi);
        System.out.println(m.subtract(11, 10));

        // If the MathUtils.pi is changed, it is changed for all instances.
        MathUtils m1 = new MathUtils();
        m1.pi = 12;

        System.out.println(m.pi + " " + MathUtils.pi + " " + m1.pi); // These will print out 12.
        // MathUtils.pi was changed in this class so the rest of the instances are changed.
    }
}

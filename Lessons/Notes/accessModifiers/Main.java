package Notes.accessModifiers;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); // From the same package.
        p.name = "James";
        p.greet();
        p.city = "Chicago";
        p.sayGoodbye();
    }
}

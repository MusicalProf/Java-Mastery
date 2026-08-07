package Notes.workingWithStrings;

public class StringImmutability {
    public static void main(String[] args) {
        // Immutable
        String s1 = "Hi";
        String s2 = s1;

        System.out.println(s1 + " " + s2);

        s1 = "Hello";
        System.out.println(s1 + " " + s2); // Because of string immutability, s2 doesn't get changed
        // when s1 is reassigned.
        // Instead a new object gets created, instead of overwriting the original value.

        //mutable objects
        Text t1 = new Text();
        t1.setDescription("This is a mutable object.");
        Text t2 = t1;

        System.out.println(t1.getDescription() + " " + t2.getDescription());
        t1.setDescription("Still a mutable object.");

        System.out.println(t1.getDescription() + " " + t2.getDescription()); // Objects are mutable.
        // The original object is changed instead of creating a new object. This is because both are pointing to the
        // same object on the heap, which is therefore pointing to another object on the heap.
    }
}

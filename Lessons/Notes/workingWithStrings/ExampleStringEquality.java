package Notes.workingWithStrings;

public class ExampleStringEquality {
    public static void main(String[] args) {
        // Both of these strings are in the string pool. Because they are holding the same value, the reference is
        // is the same.
        String s1 = "Hi";
        String s2 = new String("Hi");

        System.out.println(s1 == s2); // This will return false as one string was created using the new keyword.
        System.out.println(s1.equals(s2)); // This is the correct way to compare strings as it is comparing the value,
        // and not the reference.
    }
}

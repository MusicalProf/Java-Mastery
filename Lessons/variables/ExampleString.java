package variables;

public class ExampleString {
    public static void main(String[] args){
        // A few operations for strings.
        String s1 = "hi";
        String s2 = "hello";
        boolean same = s1.equals(s2); // False. This is correct way to compare strings.
        System.out.println(same);

        System.out.println(s1.toUpperCase()); // Doesn't modify the string.
        System.out.println(s1); // The variable is still intact.

        s1 = s1.toUpperCase(); // Modifies the string.
        System.out.println(s1);

        String substring = s2.substring(1, 4); // Beginning index: 1, Ending index(excluding): 4.
        System.out.println(substring); // Prints "ell"

        boolean startsWith = s2.startsWith("h"); // True as the string starts with the letter h.
        System.out.println(startsWith);

        System.out.println(s2.length()); // Shows the length of the string.
        System.out.println(s2.charAt(3)); // Returns the character at the specified index.
    }
}

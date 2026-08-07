package Notes.workingWithStrings;

public class ExampleStrings {
    public static void main(String[] args) {
        // The String class is used for dealing with text.
        String firstName = "Johnny"; // String literal
        String firstName2 = new String("Joey"); // created using the new keyword. Not really necessary.

        String greeting = "Hello " + firstName + " and " + firstName2 + "!"; // String Concatenation
        System.out.println(greeting);

        // Common methods:
        // length - returns the length of the string
        int length = greeting.length();
        System.out.println(length);

        // charAt - returns a character at an index.
        System.out.println(greeting.charAt(0));

        // indexOf - returns the index of the first occurrence of the specified string (substring).
        System.out.println(greeting.indexOf("ello")); // Returns -1 if the occurrence isn't found.

        // substring - returns a new string that is the substring of calling string, starting at the specified index
        // til the end of the string or a specified end.
        System.out.println(greeting.substring(3));
        System.out.println(greeting.substring(3, 7)); // The range is exclusive. Continues until the end -1.

        // toUpperCase/toLowerCase - returns a copy of the calling string with all characters converted to upper/lower
        //case.
        System.out.println(firstName.toUpperCase() + " " + firstName2.toLowerCase());

        // trim - returns a copy of the calling string with all the trailing white space removed.
        String str = "     Hello, World!      ";
        System.out.println(str.trim());
    }
}

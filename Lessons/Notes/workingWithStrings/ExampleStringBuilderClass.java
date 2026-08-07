package Notes.workingWithStrings;

public class ExampleStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is my String builder.");

        // append - add strings to the end of the stringbuilder.
        sb.append(" And I love Java!");
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", ");
        sb1.append("World");
        sb1.append("!");
        String greeting = sb1.toString();

        System.out.println(s);
        System.out.println(greeting);

        // StringBuffer is thread safe. However, it comes at the cost of slower performance. It's generally better to
        // use StringBuilder.

    }
}

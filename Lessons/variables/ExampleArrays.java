package variables;

public class ExampleArrays {
    public static void main(String[] args) {
        int[] nrs = {1, 2, 3, 4, 5};
        System.out.println(nrs[0]); // Prints 1
        nrs[4] = 10; // Assigns 10 to the last position
        System.out.println(nrs[4]); // Prints 10
        System.out.println(nrs); // Arrays are reference types/objects. Shows the object reference in memory.
        System.out.println(nrs.length); // Prints the length of 5.
    }
}

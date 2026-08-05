package Exercises.ObjectsPractice.PassPrimitiveDataType;

public class Main {
    public static void main(String[] args) {
        // Pass a primitive data type to a method, modify it, and print the value before and after the method call.
        int number = 25;
        System.out.println("Original value: " + number);

        modifyNumber(number);
        System.out.println("New value: " + number); // Still going to be 25 as the original value is immutable.
    }

    public static void modifyNumber(int num) {
        num *= 2;
    }
}

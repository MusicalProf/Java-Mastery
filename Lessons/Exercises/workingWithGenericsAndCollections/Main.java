package Exercises.workingWithGenericsAndCollections;

public class Main {
    public static void main(String[] args) {
        // Create a Box object with an Integer content and a Box object with a String content.
        Box <Integer> intBox = new Box<>();
        intBox.setContent(37);

        Box <String> strBox = new Box<>();
        strBox.setContent("Hello World!");

        System.out.println("This is the number in the integer box: " + intBox.getContent());
        System.out.println("This is the string in the String box: " + strBox.getContent());
    }
}

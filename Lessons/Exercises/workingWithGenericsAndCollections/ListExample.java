package Exercises.workingWithGenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of String objects and add three elements to it.
        List<String> strings = new ArrayList<>();
        strings.add("My Leg!");
        strings.add("OOOOO MAH GOSH!!");
        strings.add("Hello, Javanista!");

        for(String str : strings){
            System.out.println(str);
        }
    }
}

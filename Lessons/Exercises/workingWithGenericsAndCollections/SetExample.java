package Exercises.workingWithGenericsAndCollections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set of Integer objects and add four elements to it.
        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(40);
        integers.add(80);

        for(int num : integers){
            num *= 2;
            System.out.println(num);
        }
    }
}

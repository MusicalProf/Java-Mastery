package Notes.genericsAndCollections;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        // Sets are unordered, unique, and an element can be retrieved by its index.

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(10);
        integerSet.add(100);
        integerSet.add(10); // This won't stop the program from compiling. It'll just omit this duplicate.

        System.out.println(integerSet);

        for(int i : integerSet){ // We can us a for loop to iterate over this collection.
            System.out.println(i);
        }
    }
}

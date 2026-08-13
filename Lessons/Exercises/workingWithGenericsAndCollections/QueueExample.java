package Exercises.workingWithGenericsAndCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of Character objects and enqueue three elements to it.
        Queue<Character> characters = new LinkedList<>();
        characters.add('H');
        characters.add('I');
        characters.add('J');

        System.out.println(characters);
    }
}

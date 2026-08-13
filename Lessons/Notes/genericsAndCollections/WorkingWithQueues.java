package Notes.genericsAndCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // With Queues you can add and remove from both the beginning and the end.
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C#");

        strings.peek(); // Shows the head of the queue.
        strings.pop(); // Returns the last element added.
        strings.push("JavaScript"); // Pushes and replaces the first element at the front of the deque.
        strings.addFirst("Java");
        strings.add("Rust");
        System.out.println(strings.peek());
        System.out.println(strings);
        System.out.println(strings.pollLast()); // Returns the last element from the deque.
    }
}

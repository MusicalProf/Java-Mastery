package notes.concurrentProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentCollectionsJava {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("JavaScript");

        for(String language : languages) {
//            languages.add("new"); // This line will cause a ConcurrentModificationException to be thrown
            System.out.println("Language: " + language); // We can iterate over the array list, but this
            // isn't thread safe.
        }

        // We would instead use a Concurrent collection to avoid throwing this exception.
        ConcurrentMap<String, String> languageMap = new ConcurrentHashMap<>();
        languageMap.put("John", "Java");
        languageMap.put("Penny", "Python");

        for(String key : languageMap.keySet()) {
            System.out.println(key + " prefers " + languageMap.get(key)); // This is thread safe and we can also modify
            // the hashmap using the for loop.
        }

        // Blocking queues wait for the queue to become non-empty when retrieving and waits for space to become
        // available to store an element.
        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
        try{
            queue.put("Message one");
            String message = queue.take(); // Waits for the queue to become non-empty.
            System.out.println("Message taken: " + message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Backed by skip lists; provide the average log n time cost for the operations.
        // Keeps the keys ordered naturally.
        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("C", "cat");
        map.put("A", "apple");
        map.put("B", "bear");
        // Use descending map to get a reverse order view of the keys.
        map.descendingMap().forEach((key, value) -> System.out.println(key + " -> " + value));

        // CopyOnWriteArrayList/CopyOnWriteArraySet - used when the traversal operations outweigh mutations.
        // Used when we don't want to or can't synchronize traversals, but need to ensure interference among concurrent
        // threads.
        // This should not be used when the write operations are frequent. Produces too much overhead.
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("One");
        list.add("Two");
        // Modifying the ConcurrentArrayList makes a copy of the array and returns the modified copy. This keeps it
        // thread safe and avoids the ConcurrentModificationException.
        for (String s : list){
            System.out.println(s);
        }
    }
}

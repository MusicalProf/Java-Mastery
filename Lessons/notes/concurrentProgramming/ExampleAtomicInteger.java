package notes.concurrentProgramming;

import java.util.concurrent.atomic.AtomicInteger;

public class ExampleAtomicInteger {
    // Atomic classes represent types like Integers or objects and offer indivisible operations on those objects.
    // When a thread reads and modifies a value, it becomes a single operation. Making it thread-safe.
    private static AtomicInteger counter = new AtomicInteger(0);
//    private static Integer counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                 counter.getAndIncrement(); // Atomic operation
//                counter = counter + 1;
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                 counter.getAndIncrement(); // This will allow a single uninterrupted operation.
//                counter = counter + 1;
            }
        });
        // Without an Atomic operation, the threads below will overwrite each other randomly.
        thread1.start(); // Both of these threads will run and give back a value.
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter: " + counter);
    }
}

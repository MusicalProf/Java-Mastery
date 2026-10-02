package notes.concurrentProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        // The fixed thread pool reuses a fixed number of threads to execute tasks.
        ExecutorService executor =  Executors.newFixedThreadPool(2);

        Runnable task1 = () -> System.out.println("Executing task 1 inside: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Executing task 2 inside: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Executing task 3 inside: " + Thread.currentThread().getName());
        Runnable task4 = () -> System.out.println("Executing task 4 inside: " + Thread.currentThread().getName());

        // These tasks will be executed by 2 threads concurrently, so the total number of active threads will not
        // the limit of 2.
        // The threads will execute in random order.
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown(); // This will make sure the executor accepts no new tasks and shutdown after the threads
        // are finished.
    }
}

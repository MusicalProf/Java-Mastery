package notes.concurrentProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        // The Executor service allows use to manage asynchronous task execution. Useful for several tasks needing to
        // be run, but the order of the output is important.
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> System.out.println("Executing task 1 inside: " +  Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Executing task 2 inside: " +  Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Executing task 3 inside: " +  Thread.currentThread().getName());

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        executor.shutdown(); // This will make the executor accept no new tasks and shut down after all running threads
        // finish
    }
}

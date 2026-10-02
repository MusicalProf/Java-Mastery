package exercises.concurrentProgrammingAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    // Create an application that submits tasks to an ExecutorService which prints out the current thread's name.
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println("Executing process in: " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}

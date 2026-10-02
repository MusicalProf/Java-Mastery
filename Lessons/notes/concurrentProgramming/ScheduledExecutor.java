package notes.concurrentProgramming;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        // Creates a ScheduledExecutorService with a pool size of 1
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // Runnable task to send updates
        Runnable updateTask = () -> {
            System.out.println("Sending random updates! Timestamp: " + System.currentTimeMillis() / 1000);
        };

        // Schedule the task to run after an initial delay of 0 seconds and subsequently with a delay of 2 seconds
        executor.scheduleWithFixedDelay(updateTask, 0, 2, TimeUnit.SECONDS);

        try {
            // Main thread sleeps for 10 seconds to observe the scheduled tasks
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Remember to shut down the service.
        executor.shutdown();
    }
}

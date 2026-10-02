package notes.concurrentProgramming;

public class SleepAndJoin {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
           try {
               System.out.println("Thread will go to sleep for 2 seconds...");
               Thread.sleep(2000);
               System.out.println("Yawn.... I'm awake now.");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });
        t.start();

        Thread t2 = new Thread(() -> {
            System.out.println("t2 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 has finished.");
        });
        t2.start();

        try{
            System.out.println("Main thread will be waiting for t2 to finish.");
            t2.join(); // Main thread waits for t2 to complete.
            System.out.println("Main thread continues...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

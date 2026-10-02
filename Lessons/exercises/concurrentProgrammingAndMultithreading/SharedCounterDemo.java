package exercises.concurrentProgrammingAndMultithreading;

public class SharedCounterDemo {
    // Demonstrate the need for synchronization using a shared counter.
    // Add the synchronized keyword to fix the problem.
    static int counter = 0;

    static synchronized void increment() { // Added synchronized to ensure proper behavior.
        int current = counter;
        System.out.println("Before incrementing: " + counter + " , Current thread: " +
                Thread.currentThread().getName());
        counter = current + 1;
        System.out.println("After incrementing: " + counter + " , Current thread: " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(SharedCounterDemo::increment).start();
        }

    }
}

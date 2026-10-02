package notes.concurrentProgramming;

public class Count {
    static int counter = 0;

    // This wouldn't be the ideal way of using synchronized, but it does work for thread-safety.
    // We could also use Atomic Classes to implement the below.
    static synchronized void incrementCounter() { // With the synchronized keyword, any threads created will work
        // in tandem, and not randomly overwrite values.
        int current = counter;
        System.out.println("Before: " + counter + ", Current thread: " + Thread.currentThread().getId());
        counter = current + 1;
        System.out.println("After: " + counter);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Thread(Count::incrementCounter).start(); // 10 new threads have been implemented. The value we expect
            // is 10.
        }
    }
}

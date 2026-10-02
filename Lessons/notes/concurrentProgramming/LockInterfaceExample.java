package notes.concurrentProgramming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterfaceExample {
    // Synchronization has limited capabilities. It's a foundational level of thread safety, but lacks the ability
    // to inspect lock status or implement timeout conditions.
    // The Lock interface allows us to address these limitations.
    // Locks provide certain advantages over synchronized such as:
    // Lock polling and timeout - allows methods to check for lock availability or wait for locks with a specific
    // timeout, which offers more control over thread behavior.
    // Interruptible Lock acquisition - helps to prevent deadlock situations by allowing for a thread to be interrupted
    // while waiting for a lock to become available.
    // Fairness - Reentrant lock can be configured so the longest waiting thread receives a lock next. Synchronized
    // cannot guarantee this.
    // Lock separation - allows for multiple lock instances vs synchronized only concerning itself with the intrinsic
    // locks of the threads.
    // Using a counter class example below:
    private static int counter = 0;

    private static final Lock lock = new ReentrantLock(); // Implement the lock interface.

    public static void incrementCounter() {
        // We can also use the tryLock method to allow for more flexibility.
        if (lock.tryLock()) { // Initiate the lock method. Offers more control over the synchronization.
            try {
                int current = counter;
                System.out.println("Before: " + current + ", Current thread: " + Thread.currentThread().getId());
                counter = current + 1;
                System.out.println("After: " + current);
            } finally {
                lock.unlock(); // Always unlock in the finally block.
            }
        } else  { // This will only execute in the event the lock isn't available to use.
            System.out.println("Perform other tasks.");
        }
    }
    // Best Practices: Unlock in finally block, Be cautious with lock fairness, and use ReadWriteLock method
    // for read-heavy duties.
    // Reentrant lock can lead to verbose code. Best to think if this is necessary.
}

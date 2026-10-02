package notes.concurrentProgramming.commonProblems;

public class DataRaceExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Both threads are accessing the same method in the shared resource class.
        Thread thread1 = new Thread(() -> {
            resource.increment();
        });

        Thread thread2 = new Thread(() -> {
            resource.increment();
        });

        // This could lead to a data race with the count variable, as synchronization isn't applied.
        // This makes the operations vulnerable.
        thread1.start();
        thread2.start();

        // Race condition occurs when the correctness depends on the relative timing of multiple threads.
        // This can lead to erratic behavior.
        System.out.println("Main thread started");
        System.out.println(resource.getCount());
    }
}

// Not the best practice to put classes in another class.
// Instance class for example purposes.
class SharedResource {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
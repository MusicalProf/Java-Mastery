package notes.concurrentProgramming;

public class Counter {
    private int count;

    public void increment(){
        synchronized (this){ // Synchronized is much better used for smaller blocks of code to initialize thread safety.
            count++;
        }
    }

    public int getCount() {
        synchronized (this) { // This gives us finer control over the code.
            return count;
        }
    }
}

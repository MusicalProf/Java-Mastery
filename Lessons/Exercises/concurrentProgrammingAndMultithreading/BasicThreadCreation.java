package exercises.concurrentProgrammingAndMultithreading;

public class BasicThreadCreation {
    public static void main(String[] args) {
        // Create a thread that prints "Hello from my thread!".
        Thread thread1 = new Thread(()->{
            System.out.println("Hello from my thread!");
        });

        thread1.start();
    }
}

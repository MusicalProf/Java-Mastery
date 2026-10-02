package notes.concurrentProgramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getId());
        MyThread myThread = new MyThread();
        myThread.start(); // This starts the new thread

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Runnable myRunnable2 = () -> System.out.println("Hello from lambda runnable!");
        Thread thread2 = new Thread(myRunnable2);
        thread2.start();
    }
}

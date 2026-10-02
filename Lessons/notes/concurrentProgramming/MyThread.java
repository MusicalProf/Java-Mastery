package notes.concurrentProgramming;

public class MyThread extends Thread {
   @Override
   public void run() {
       System.out.println("Hello from this thread." + Thread.currentThread().getId());
   }
}

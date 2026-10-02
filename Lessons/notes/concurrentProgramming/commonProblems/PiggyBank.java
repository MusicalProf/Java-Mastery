package notes.concurrentProgramming.commonProblems;

public class PiggyBank {
    private int balance = 10;

    public void orderFood(String threadName) {
        // synchronized (this) { // Synchronized allows for this method to run concurrently.
            if(balance >= 10) {
                System.out.println(threadName + " is ordering some food.");
                balance -= 10;
            } else {
                System.out.println(threadName + " cannot order anything. Balance is too low.");
            }
        }
    //}

    public int getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank();

        Thread james = new Thread(() -> pb.orderFood("James"));
        Thread jasmine = new Thread(() -> pb.orderFood("Jasmine"));

        // Due to the both threads happening at the same time, the output will show them both completing the task.
        // With a delay, we can see one of the threads outputting the else block.
        james.start();
        jasmine.start();

        // This race condition can be avoided by using the synchronized key word.
    }
}
package notes.concurrentProgramming;

public class BankAccount {
    private double balance;

    // The below methods are synchronized to ensure the class variable is updated properly.
    // Atomic classes wouldn't work as well here due to checking state and using a condition to throw an exception
    // if met.
    public synchronized void deposit(double amount) {
        balance = balance + amount;
    }

    // This operation could interfere with the above operation if not in sync.
    public synchronized void withdraw(double amount) throws Exception{
        double newBalance = balance - amount;
        if (newBalance < 0) {
            throw new Exception("Insufficient funds");
        }

        balance = newBalance;
    }

    public synchronized double getBalance() {
        return balance;
    }

    // Synchronization isn't a catch-all. If not used carefully, it can introduce thread and performance issues.
    // This is more easily seen, in lengthy synchronized sections and heavily contended lock objects.
}

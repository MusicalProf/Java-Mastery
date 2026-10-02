package notes.concurrentProgramming.commonProblems;

import java.util.concurrent.atomic.AtomicBoolean;

public class LiveLockExample {
    // A live lock happens when multiple threads are actively responding to the conditions, intending on
    // task completion, but they end up preventing each other from progressing, due to responding to each other as well.

    static class Person{
        private AtomicBoolean active;

        public Person(){
            active = new AtomicBoolean(true);
        }

        public void pass(Person person){
            while(active.get()){
                // Waiting for the other person to pass
                if(person.isActive()){
                    System.out.println("Waiting for the other person to pass...");
                    continue;
                }

                // Indicates this person has passed
                System.out.println("Person has passed!");
                active.set(false);
            }
        }

        public boolean isActive(){
            return active.get();
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        // These two threads will end up in a live lock situation, where the threads are actively responding to
        // the conditions. This can be rectified by writing the code properly, using delays, or adding a new thread
        // to direct the traffic.
        new Thread(()-> person1.pass(person2)).start();
        new Thread(()-> person2.pass(person1)).start();

    }
}

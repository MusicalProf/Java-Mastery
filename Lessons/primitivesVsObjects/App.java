package primitivesVsObjects;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Person p = person; // Redundant assignment, but used to show the mutability of objects.

        person.name = "Ra'mar"; // Objects are mutable. The original object has been changed.
        // The instance p has its name value changed due to the change to the person instance.
        System.out.println(p.name);

        // Primitives are stored on the stack.
        // These values are stored on the stack in sequential order.
        int x = 5;
        boolean b = true;
        x = add(1, 2);
        String y = addition(3, 4);
        // Once this method resolves, the stack is cleared.
    }

    // This method is added to the stack on top of the main method. Java accesses this first.
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
    // Because this method is returning an Object, it gets added to the Heap.
    // Objects are bigger than primitives, so the heap is necessary.
    // If an object has primitive values, they will be referenced on the heap.
    public static String addition(int a, int b){
        int c = a + b;
        return "The answer is " + c;
    }
}

package Exercises.workingWithGenericsAndCollections;

public class BagExample {
    public static void main(String[] args) {
        // Create a class Bag that has a type parameter T for its member content.
        // Create the right type of collection for a number of cases.
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Hello!");
        stringBag.addItem("There");
        stringBag.addItem("Java");
        stringBag.addItem("Collections!");
        stringBag.removeItem("Collections!");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(2);
        integerBag.addItem(24);
        integerBag.addItem(246);
        integerBag.addItem(2468);
        integerBag.removeItem(2);

        System.out.println(stringBag.getItems());
        System.out.println(integerBag.getItems());

    }
}

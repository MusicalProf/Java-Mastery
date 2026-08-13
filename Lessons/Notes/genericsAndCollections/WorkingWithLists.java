package Notes.genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>(); // List is an interface. It can't be instantiated.
        shoppingList.add("eggs");
        shoppingList.add("pasta");
        shoppingList.add("bananas");

        List<Integer> numbers = new ArrayList<>(); // Arraylist is a class with implements the list interface.
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);

        System.out.println(shoppingList);
        System.out.println(numbers);

        // Methods
        System.out.println(shoppingList.get(0)); // Prints eggs. Can also use .getFirst() to get the first element.
        shoppingList.remove("pasta"); // Removes pasta from the list.
        System.out.println(shoppingList);
        boolean containsBananas = shoppingList.contains("banana");

        System.out.println(containsBananas);
    }
}

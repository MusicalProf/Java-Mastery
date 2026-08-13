package Exercises.workingWithGenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    // Create a class Bag that has a type parameter T for its member content.
    // Create the right type of collection for a number of cases.
    private List<T> content;

    public Bag() {
        content = new ArrayList<>();
    }

    public void addItem(T item) {
        content.add(item);
    }

    public void removeItem(T item){
        content.remove(item);
    }

    public List<T> getItems() {
        return content;
    }
}

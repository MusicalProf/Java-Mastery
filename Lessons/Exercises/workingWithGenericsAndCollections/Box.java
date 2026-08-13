package Exercises.workingWithGenericsAndCollections;

public class Box<T> {
    // Create a generic class named Box with a single type parameter T. The class should have a private member
    // content of type T and a getter and setter for it.
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}


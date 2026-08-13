package Notes.genericsAndCollections;

public class Bag<T> { // The generics can be of any object type.
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

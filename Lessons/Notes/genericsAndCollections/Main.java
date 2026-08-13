package Notes.genericsAndCollections;

public class Main {
    public static void main(String[] args) {
        Bag<Kitten> kittenBag = new Bag<>(); // The bag generic is able to accept multiple data types.
        Kitten kitten = new Kitten();
        kitten.setName("Oliver");

        kittenBag.setContent(kitten); // This will only accept an object of type kitten.

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("Lappie");

        laptopBag.setContent(laptop); // This will only accept an object of type laptop.
    }
}

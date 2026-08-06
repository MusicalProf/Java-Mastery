package Notes.moreAccessModifiers;

import Notes.accessModifiers.Person; // Imported from another package.

public class App extends Person{ // Makes this class a subclass of Person.
    public static void main(String[] args) {
        Person p2 = new Person(); // Able to be used due to the public access modifier.
        p2.name = "Bob";
        p2.greet();
        // p2.sayGoodbye(); // Cannot be used in this package, due to App not being a subclass or part of the package.
    }

    public void greeting(){
        sayGoodbye(); // Can be used like it is part of the class. Just not on other objects.
        city = "St. Louis";
    }
}

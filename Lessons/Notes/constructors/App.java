package Notes.constructors;

public class App {
    public static void main(String[] args) {
//        Student s1 = new Student(); // If this class is compiled with the empty parameters in this constructor,
        // it will create a default constructor in the compiled class.
        Student s2 = new Student("John", 21); // Compiling this will remove the default constructor.
//        System.out.println("Name: " + s2.getName() + " Age: " + s2.getAge() + " Student ID: " + s2.getStudentNumber());

        Car c = new Car(); // This will print out both statements as the first call is to the Parent constructor.
        // Java automatically adds super implicitly.
        // Constructors are not inherited.

    }
}

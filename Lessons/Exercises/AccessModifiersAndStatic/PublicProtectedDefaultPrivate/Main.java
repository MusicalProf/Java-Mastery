package Exercises.AccessModifiersAndStatic.PublicProtectedDefaultPrivate;

public class Main {
    public static void main(String[] args) {
        // Create a class with fields using different access modifiers and try to access them from another class.

        Person p = new Person();
        p.name = "Dory";
        p.age = 24;
        p.address = "42 Wallaby Way, Sydney, Australia";
//        p.ssn = "111 - 22 - 3333"; // Cannot be accessed or modified without a getter/setter.

        System.out.println("Name: " + p.name);
        System.out.println("Age " + p.age);
        System.out.println("Address: " + p.address);
//        System.out.println("SSN: " + p.ssn); // Will not compile due to private modifier.
    }
}

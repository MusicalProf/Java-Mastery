package Notes.primitivesVsObjects;

public class Pass {
    // Java is pass by value. Which means a copy of the value gets created.
    // Primitives are immutable, so when the copied value is changed, the original value is untouched.
    // Objects are mutable, so when the copied value is changed, the original object value also changes with the copy.
    public static void main(String[] args) {
        int i = 3;
        Person p = new Person();
        p.name = "Scott";
        changeThings(i, p); // Only copies of the original values are sent as parameters.
        System.out.println(i + " " + p.name); // i is still 3. p.name is now changed.
    }

    public static void changeThings(int x, Person person){
        x = 5; // This will not change the integer i as primitives are immutable.
        person.name = "Miley Cyrus"; // A copy of the object reference is sent, but the original object gets changed.
    }
}

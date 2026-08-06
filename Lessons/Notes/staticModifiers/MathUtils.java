package Notes.staticModifiers;

public class MathUtils {

    // Static means the variable belongs to the class itself. It is shared by all instances of this class.
    // It can be accessed from a non-static context.
    // However, static restricts access to non-static properties or methods.
    // Static members don't requite an instance of the object.
    public static double pi = 3.14159265359;

    public static double subtract(double a, double b) {
        return a - b;
    }
}

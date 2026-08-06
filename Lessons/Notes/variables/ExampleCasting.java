package Notes.variables;

public class ExampleCasting {
    public static void main(String[] args){
        long l = 123;
        int x = (int) l; // An int is smaller than a long so it needs the explicit casting.

        double d = 3.2;
        float f = (float) d; // Double is smaller than a float.

        // this will be a problem.
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = c;
        System.out.println(i); // 65513

        char maxChar = 65535; // This is the max value a char can hold.
        // Trying to add 1 will make new char equal 0, as it's at the max.
        char newChar = (char) (maxChar + 1);
        // Works the same if it were at the minimum amount, only this time, it cycles to 65535.
        char minChar = 0; //
        char newMinChar = (char) (minChar - 1);

        System.out.println(maxChar); // Shows nothing.
        System.out.println(newChar); // Shows a symbol which looks like a zero.
        System.out.println((int)newChar); // Shows the min char can hold.

        System.out.println(minChar); // Shows a zero symbol.
        System.out.println(newMinChar); // Shows nothing.
        System.out.println((int)newMinChar); // Shows the max char can hold.
    }
}

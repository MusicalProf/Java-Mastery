package variables;

public class ExampleOperators {
    public static void main(String[] args){
        // arithmetic operators
        double x = 2;
        double y = 3;
        double z = x + y;
        System.out.println("Sum: " + z); // Addition
        System.out.println("Difference: " + (x - y)); // Subtraction
        System.out.println("Product: " + (x * y)); // Multiplication
        System.out.println("Quotient: " + (x / y)); // Division - both variables should be doubles for clean division

        int nr1 = 10;
        int nr2 = 4;
        int result = nr1 % nr2; // Modulus - returns the remainder of the division
        System.out.println("Modulus: " + result);

        // assignment operator
        int nr3 = 7;
        int nr4 = 70;
        nr3 += nr4; // adds and assigns the new value to the variable
        System.out.println(nr3);
        nr3 -= nr4; // subtracts and assigns the new value to the variable
        System.out.println(nr3);

        //unary operators
        int nr5 = 8;
        nr5++; // adds one to the variable
        System.out.println(nr5);
        nr5--; // subtracts one from the variable
        System.out.println(nr5);

        int nr6 = 3;
        System.out.println(-nr6); // negates the positive number
        System.out.println(nr6);

        int pre = 5;
        int post = 5;
        System.out.println(++pre); // increases the variable first, then prints to the console.
        System.out.println(post++); // prints to the console, then increases the variable.
        System.out.println("post: " + post + " pre: " + pre);

        // relational operators
        int small = 2;
        int big = 10;
        System.out.println(small == big); // False
        System.out.println(small != big); // True
        System.out.println(small > big); // False
        System.out.println(small >= big); // False
        System.out.println(small <= big); // True
        System.out.println(small < big); // True

    }
}

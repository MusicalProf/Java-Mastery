package Notes;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name please: ");
//        String name = scanner.nextLine();
//        System.out.printf("Hello, %s!", name);

//        int a[][]= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//        int b[][]= { { 7, 8, 9 }, { 4, 5, 6 }, { 1, 2, 3 } };
//        //creating another matrix to store the sum of two matrices
//        int[][] c= new int[3][3];
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//                //System.out.println(c[i][j] + " ");
//                System.out.println(Arrays.deepToString(c));
//            }
//            System.out.println(); //new line
//        }
//        int[] arr = {4, 2, 1, 8, 5, 3};
//        Arrays.sort(arr);
//        for(int num : arr){
//            System.out.println(num);
//        }

//        int a = 10;
//        int b = ++a + a++ + --a + a;
//        // ++a = 11, a++ = 12, --a = 11, + 11.
//        System.out.println(b);
//
//        MyObject obj; obj = new MyObject();

//        System.out.println(GCD(20, 25));
//        int foo = 30;
//        int bar = 10;
//        System.out.println(Math.pow(foo, bar));
    }

    public static int GCD(int a, int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }
}

class MyObject{

}

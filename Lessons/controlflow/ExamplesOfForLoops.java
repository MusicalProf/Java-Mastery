package controlflow;

public class ExamplesOfForLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println((int)(Math.random() * 10));
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 7;
        int index = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search) {
                index = i;
            }
        }
        System.out.println("Index " + index + ": " + numbers[index]);

        for(int row = 1; row <= 15; row++){
            for(int col = 1; col <= 15; col ++){
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}

package Notes.controlflow;

public class ExamplesOfBreakAndContinue {
    public static void main(String[] args) {
        // Break and continue should be used as little as possible, if it can be avoided.
        // Example of break in action.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 10};
        int search = 8;
        int index = -1;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search){
                index = i;
                break; // Break allows for the loop to exit immediately.
            }
        }
        System.out.println("The index of the number is: " + index);

        // Example of continue in action.
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        for(int num : numbers2){
            if (num % 2 == 0) {
                continue; // Continue skips the current iteration and goes to the next one.
            }
            System.out.println(num);
        }
    }
}

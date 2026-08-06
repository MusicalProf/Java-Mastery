package Notes.controlflow;

public class ExamplesOfWhileLoops {
    public static void main(String[] args) {
        boolean notFound = true;

        while(notFound){
            int randomNumber = (int) (Math.random() * 11); // Need to multiply by 11 for this code to work.
            System.out.println("Generated number: " + randomNumber);
            if(randomNumber == 10){
                notFound = false;
            }
        }

        int i = 0;

        while(i < 100) {
            System.out.println(Math.pow(i, 2));
            i++;
        }
    }
}

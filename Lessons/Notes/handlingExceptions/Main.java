package Notes.handlingExceptions;

public class Main {
    public static void main(String[] args) {
        try {
            print("Hello You!");
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
    }

    public static void print(String str) throws WrongInputException{
        if(str.length() < 11) {
            System.out.println(str);
        }else{
            throw new WrongInputException("The string is too long!");
        }
    }
}

// Don't overuse custom exceptions.

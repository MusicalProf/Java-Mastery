package Notes.handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {//throws FileNotFoundException
        // Try/Catch is the "best" way of handling exceptions due to allowing the program to continue.
        try(FileReader reader = new FileReader("sample.txt")) { // Try-with resources allows us to specify
            // resources which need to be closed. Not all resources are auto-closeable. Also, the finally block is not
            // needed in the try-with resources block.
            File file = new File("sample.txt");
//            FileReader reader = new FileReader(file); // Because this can throw a FileNotFound Exception,
            // we need to handle it in the method.
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e){ // More generic exceptions need to be later in the try/catch block.
            System.out.println("IO exception.");
        } finally {
            System.out.println("Just continuing this."); // The finally block allows for a continuation after the catch
            // block. It will run regardless of an exception or not.
        }
        System.out.println("Done");

    }
}

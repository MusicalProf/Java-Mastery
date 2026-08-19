package Notes.readingAndWritingFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        // This will create a new file writer instance to write files. The append option adds the text to the end
        // of the file instead of overwriting the file.
        try(FileWriter writer = new FileWriter("output.txt", true)){
            writer.write("Hello there!\n"); // Use \n to go to a new line.

            writer.write("Hope you enjoy your time here!");
        } catch (IOException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}

package Notes.readingAndWritingFiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("Java-Mastery/Lessons/Notes/ReadingAndWritingFiles/file.txt")) {
            int data;
            while((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println("An I/O exception occurred.");
        }
    }
}

package Exercises.readingAndWritingFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    // Read the contents of a text file and print the contents to the console using FileReader.
    public static void readFile(String file) {
        try (FileReader fileReader = new FileReader(file)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

package Exercises.readingAndWritingFiles;

import java.io.FileNotFoundException;

public class TestReader {
    // Read the contents of a text file and print the contents to the console using FileReader.
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "input.txt";
        ReadFromFile.readFile(filename);
    }
}

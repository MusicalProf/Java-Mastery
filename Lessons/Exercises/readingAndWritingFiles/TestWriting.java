package Exercises.readingAndWritingFiles;

import java.io.FileNotFoundException;

public class TestWriting {
    // Write a list of names to a text file using FileWriter.
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "testWriting.txt";
        String[] names = {"James", "Gerry", "West", "Harry", "Allison"};

        WriteToFile.writeNames(fileName, names);
    }
}

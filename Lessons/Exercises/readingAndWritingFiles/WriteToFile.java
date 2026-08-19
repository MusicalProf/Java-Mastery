package Exercises.readingAndWritingFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    // Write a list of names to a text file using FileWriter.
    public static void writeNames(String filePath, String[] names) throws FileNotFoundException {
        try(FileWriter fileWriter = new FileWriter(filePath)){
            for(String name : names){
              fileWriter.write(name + "\n");
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

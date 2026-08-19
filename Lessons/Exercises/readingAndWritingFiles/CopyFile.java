package Exercises.readingAndWritingFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    // Read the contents of a text file using FileReader and write the contents to a new file using FileWriter.
    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException{
        try(
                FileReader fileReader = new FileReader(sourcePath);
                FileWriter fileWriter = new FileWriter(destinationPath)){
            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }
        } catch(IOException e){
            System.out.println("Error reading or Writing files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String source = "input.txt";
        String destination = "newFile.txt";
        try{
            copyFile(source, destination);
            System.out.println("File copied successfully.");
        }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}

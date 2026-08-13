package Exercises.workingWithEnums.basicEnums;

public class BasicEnumExample {
    // Create a basic enum named Weekday that represents the days of the week.
    public static void main(String[] args) {
        for(Weekday day : Weekday.values()){
            System.out.println(day);
        }
    }
}

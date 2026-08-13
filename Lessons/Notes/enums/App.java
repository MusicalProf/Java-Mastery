package Notes.enums;
// Enums extend/inherit from the java.lang.Enum class.
// Extending from another class is not allowed.
// You cannot extend an enum either as they aren't inheritable, due to the number of instances are fixed.

public class App {
    public static void main(String[] args) {
        DayOfTheWeek today = DayOfTheWeek.SATURDAY;
        DayOfTheWeek yesterday = DayOfTheWeek.FRIDAY;
        DayOfTheWeek tomorrow = DayOfTheWeek.SUNDAY;

        if(today == yesterday){
            System.out.println("The same day");
        } else{
            System.out.println("Not the same day.");
        }

        System.out.println(today.ordinal());// Shows the numeric value of the enum set.
        System.out.println(tomorrow.getFullName());
        System.out.println(tomorrow.getNumOfDay());
        System.out.println(tomorrow.isWeekend());

        for(DayOfTheWeek day : DayOfTheWeek.values()){
            System.out.println(day.getNumOfDay() + " " + day.getFullName());
        }
    }
}

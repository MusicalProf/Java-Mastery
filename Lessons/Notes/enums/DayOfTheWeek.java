package Notes.enums;

public enum DayOfTheWeek {
    // Basic Enum
    // Enums are a special class, and all instances are created once an instance is created.
    // They are converted into a final static class by Java.
    SUNDAY("Sunday", 1),
    MONDAY("Monday", 2),
    TUESDAY("Tuesday", 3),
    WEDNESDAY("Wednesday", 4),
    THURSDAY("Thursday", 5),
    FRIDAY("Friday", 6),
    SATURDAY("Saturday", 7);

    private final String fullName;
    private final int numOfDay;

    DayOfTheWeek(String fullName, int numOfDay){
        System.out.println("In enum constructor: " + fullName); // Example to show all instances are created.
        this.fullName = fullName;
        this.numOfDay = numOfDay;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumOfDay(){
        return numOfDay;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}




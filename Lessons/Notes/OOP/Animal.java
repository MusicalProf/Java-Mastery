package Notes.OOP;

public class Animal {
    public static String type = "Animal";
    public String name;
    private int age;
    private int numOfLegs;

    public int getAge() { // Encapsulation - insulates the class parameters to only be accessed from within the class.
        return age;
    }

    public void setAge(int age) {
        if(age > 0){ // This is possible because the field is private. Allows for checks before setting.
            this.age = age;
        }
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        if(numOfLegs > 0){
            this.numOfLegs = numOfLegs;
        }
    }

    public void eat(){
        System.out.println(name + " is eating their food.");
    }
}

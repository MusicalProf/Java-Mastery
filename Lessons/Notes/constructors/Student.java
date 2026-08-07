package Notes.constructors;

public class Student extends Person{
    private int age;
    private String studentNumber;

    public Student(String name, int age) { // This is a custom constructor
        this(name, age, "T01088942"); // This can be used to call another constructor in the same class.
    }

    public Student(String name, int age, String studentNumber){
        super(name); // Super calls a constructor in the parent class.
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}

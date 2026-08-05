package Exercises.ApplicationStructure.UniversityApplication.main;

import Exercises.ApplicationStructure.UniversityApplication.university.Course;
import Exercises.ApplicationStructure.UniversityApplication.university.Student;
import Exercises.ApplicationStructure.UniversityApplication.university.Enrollment;
public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Ra'mar Leach";
        student.studentId = 1088942;

        Course course = new Course();
        course.courseName = "Java To Mastery Bootcamp";
        course.courseId = 1004457;

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

//        System.out.print("Student name: " + student.name);
//        System.out.println(", Student id: " + student.studentId);
//
//        System.out.print("Course name: " + course.courseName);
//        System.out.println(", Course ID: " + course.courseId);

        System.out.println("Enrollment Information: ");
        System.out.println("Student Name: " + enrollment.student.name);
        System.out.println("Student ID: " + enrollment.student.studentId);
        System.out.println("Course Name: " + enrollment.course.courseName);
        System.out.println("Course ID: " + enrollment.course.courseId);
    }
}

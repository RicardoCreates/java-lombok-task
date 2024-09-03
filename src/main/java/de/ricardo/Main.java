package de.ricardo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student(1, "Peter Müller", "123 Fake Street", "A");
        Student student2 = new Student(2, "Alena Horst", "245 Fake Street", "C");

        // Teacher
        Teacher teacher = new Teacher(1, "Herr. Pape", "Mathe");

        // Student List
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // Course
        Course course = new Course(1, "Mathe 101", teacher, students);

        // Print
        System.out.println(course);

        // Getters
        System.out.println("Course Name: " + course.getName());
        System.out.println("Teacher: " + course.getTeacher());

        // Setter
        student1.setGrade("A+");
        System.out.println("Updated Student: " + student1);

        //Check
        Student student3 = new Student(1, "Peter Müller", "123 Fake Street", "A+");
        System.out.println("Student1 equals Stundent3: " + student1.equals(student3));


    }
}
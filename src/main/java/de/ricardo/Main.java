package de.ricardo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        //Student student1 = new Student(1, "Peter Müller", "123 Fake Street", "A");
        //Student student2 = new Student(2, "Alena Horst", "245 Fake Street", "C");
        Student student1 = Student.builder()
                .id(1)
                .name("Peter Müller")
                .address("123 Fake Street")
                .grade("A")
                .build();

        Student student2 = Student.builder()
                .id(2)
                .name("Alena Horst")
                .address("245 Fake Street")
                .grade("C")
                .build();

        // Teacher
        // Teacher teacher = new Teacher(1, "Herr. Pape", "Mathe");

        Teacher teacher = Teacher.builder()
                .id(1)
                .name("Herr. Pape")
                .subject("Mathe")
                .build();

        // Student List
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // Course
        //Course course = new Course(1, "Mathe 101", teacher, students);
        Course course = Course.builder()
                .id(1)
                .name("Mathe 101")
                .teacher(teacher)
                .students(students)
                .build();

        // Print
        System.out.println(course);

        // Getters
        //System.out.println("Course Name: " + course.getName());
        //System.out.println("Teacher: " + course.getTeacher());

        // Setter
        // student1.setGrade("A+");
        // System.out.println("Updated Student: " + student1);

        //Check
        // Student student3 = new Student(1, "Peter Müller", "123 Fake Street", "A+");
        // System.out.println("Student1 equals Stundent3: " + student1.equals(student3));

        // Modified grade
        Student student3 = student1.withGrade("A+");
        System.out.println("Modified Student: " + student3);

        // Teacher different subject
        Teacher teacher2 = teacher.withSubject("Bio");
        System.out.println("Modified Teacher: " + teacher2);

        // Course different name
        Course course2 = course.withName("Neuer Kursname");
        System.out.println("Modified Course: " + course2);


    }
}
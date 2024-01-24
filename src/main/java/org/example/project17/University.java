package org.example.project17;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Artem Ostapenko", 4, 7.5);
        Student st2 = new Student("Ivan Kosolapov", 2, 9.9);
        Student st3 = new Student("Nikita Mihalkov", 3, 5.6);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}

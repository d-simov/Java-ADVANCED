package main.CollectionsPractice.SchoolGrades;

import java.util.*;

public class Class {

    String className;
    int numberOfStudents;
    TreeSet<Student> classGroup;

    ArrayList<Teacher> teachers;

    public Class(String className, int numberOfStudents) {
        this.className = className;
        if (numberOfStudents >= 15 && numberOfStudents <= 30) {
            this.numberOfStudents = numberOfStudents;
        } else {
            this.numberOfStudents = 24;
        }
        classGroup = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.toString().compareTo(s2.toString());
            }
        });
        for (int i = 0; i < this.numberOfStudents; i++) {
            classGroup.add(new Student());
        }

        teachers = new ArrayList<>();
        for (int i = 0; i < Subject.values().length; i++) {
            teachers.add(new Teacher());
        }
    }

    public TreeSet<Student> getClassGroup() {
        return classGroup;
    }
}

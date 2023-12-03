package main.CollectionsPractice.SchoolGrades;

import java.util.*;

public class Student {

    private final String name;
    private String[] firstNames = {"Иван", "Георги", "Петър", "Димитър", "Генади", "Явор", "Станимир", "Евстати",
            "Венелин", "Красимир", "Симеон", "Парашкев", "Емилиян", "Христо", "Никола"};
    private String[] lastNames = {"Петров", "Генадиев", "Иванов", "Димитров", "Евстатиев", "Костов", "Парашкевов",
    "Хаджиев", "Константинов", "Станев", "Каракабзамалов", "Горнишки", "Томов", "Христов"};
    private List<String> notebook;

    public Student() {
        Random rand = new Random();
        this.name = firstNames[rand.nextInt(firstNames.length)] + " " + lastNames[rand.nextInt(lastNames.length)];
        this.notebook = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Arrays.equals(firstNames, student.firstNames) && Arrays.equals(lastNames, student.lastNames) && Objects.equals(notebook, student.notebook);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, notebook);
        result = 31 * result + Arrays.hashCode(firstNames);
        result = 31 * result + Arrays.hashCode(lastNames);
        return result;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void getGrade(Subject subject, int grade) {
        this.notebook.add(subject + " - " + grade);
    }
}

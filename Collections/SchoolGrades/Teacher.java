package main.CollectionsPractice.SchoolGrades;

import java.util.Random;

public class Teacher {

    String name;
    Subject teachingSubject;
    String[] teacherNames = {"Господинова", "Христова", "Златева", "Туртурикова", "Кочанова", "Гроздева", "Маврова",
    "Козарова", "Балева", "Ралева", "Яръкова"};

    public Teacher() {
        Random rand = new Random();
        this.name = teacherNames[rand.nextInt(teacherNames.length)];
        this.teachingSubject = Subject.getNextSubject();
    }

    public void setGrade(Student student, int grade){

    }

    private int validGrade(int grade) {
        if(grade < 2) {
            return 2;
        }
        else if (grade > 6) {
            return 6;
        }
        return grade;
    }

    @Override
    public String toString() {
        return "Г-жа " + this.name + " - преподавател по " + this.teachingSubject + ".";
    }
}

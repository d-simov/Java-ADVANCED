package main.CollectionsPractice.SchoolGrades;

public class DemoGrades {

    public static void main(String[] args) {

        Class fifthA = new Class("5 A", 20);

        for (Student s: fifthA.classGroup
             ) {
            System.out.println(s);
        }
        System.out.println("-------------------------");
        for (Teacher t: fifthA.teachers) {
            System.out.println(t);
        }
    }
}

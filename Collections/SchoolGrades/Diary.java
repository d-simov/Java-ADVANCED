package main.CollectionsPractice.SchoolGrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Diary {

    private final HashMap<Subject, TreeMap<Student, ArrayList<Integer>>> diary;

    public Diary()
    {
        this.diary = new HashMap<>();
    }

    public HashMap<Subject, TreeMap<Student, ArrayList<Integer>>> getDiary() {
        return diary;
    }
}

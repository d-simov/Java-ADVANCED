package main.book;

import java.util.Random;


public class Author {

    public enum Nationality {
        BRITISH, FRENCH, BULGARIAN, ROMANIAN, DUTCH, GERMAN, SPANISH, BRAZIL, CANADIAN, HUNGARIAN, RUSSIAN;
    }

    private String name;
    private int birthYear;
    private Nationality nationality;

    public Author(String name, int birthYear, Nationality nationality) {
        this.name = name;
        if (birthYear <= 2005) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = new Random().nextInt(200) + 1782;
        }
        this.nationality = nationality;
    }
}

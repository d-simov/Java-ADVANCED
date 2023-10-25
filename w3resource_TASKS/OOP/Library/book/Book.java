package main.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Book {

    final String title;
    final Author author;
    int publicationYear;
    int numberOfPages;
    String ISBN;
    List<Page> pages;
    private static int nextCurrenNumber = 2;
    Scanner sc;

    public Book(String title, Author author, int publicationYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        if (publicationYear >= (this.author.getBirthYear() + 20) && publicationYear <= 2023) {
            this.publicationYear = publicationYear;
        } else {
            this.publicationYear = 2010;
        }
        if (numberOfPages >= 20 && numberOfPages <=1000) {
            this.numberOfPages = numberOfPages;
        } else {
            this.numberOfPages = 100;
        }
        Random r = new Random();
        this.ISBN = (r.nextInt(900) + 100) + "-" + (r.nextInt(900) + 100) + "-" +
                (r.nextInt(9000) + 1000) + "-" + (r.nextInt(90) + 10) + "-" + r.nextInt(10);
        this.pages = new ArrayList<>();

        for (int i = 0; i < numberOfPages - 1; i++) {
            int chance = r.nextInt(101);
            if (chance <= 10) {
                pages.add(new Page(Book.nextCurrenNumber)  {
                    @Override
                    protected void setContents() {
                        text = "This is an illustrated page.";
                    }
                });
            }else if (chance <= 15 && i > 10) {
                pages.add(new Page(Book.nextCurrenNumber)  {
                    @Override
                    protected void setContents() {
                        text = "This is a page with notes at the end of the chapter.";
                    }
                });
            } else {
                pages.add(new textPage(Book.nextCurrenNumber));
            }
            Book.nextCurrenNumber++;
        }
        pages.add(0, new Page(1) {
            @Override
            protected void setContents() {
                text = "заглавна страница\n" + Book.this.title + "\n" + Book.this.author + "\nISBN: " + Book.this.ISBN + ("\n");
            }
        });
    }

    @Override
    public String toString() {
        return "Book: \"" +
                title + "\",\n" +
                "author - " + author +
                ",\npublished in " + publicationYear +
                ", ISBN: " + ISBN +
                "\nThe book contains " + numberOfPages +
                " pages.\n";
    }

    public void lookThroughBook() {
        pages.forEach(System.out::println);
    }


}

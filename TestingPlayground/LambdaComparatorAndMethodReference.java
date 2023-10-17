package main.Test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorAndMethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Cate", "Johnathan", "Austin", "Bob");
        System.out.println("\n=====================================\nArranged alphabetically List:" +
                "\n-------------------------------------");
        System.out.println("Original List:");
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged alphabetically List:" +
                "\n-------------------------------------");
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged alphabetically List using " +
                "Method reference:\n-------------------------------------");
        names.sort(String::compareTo);
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged by shortest first List:" +
                "\n-------------------------------------");
        names.sort((s1, s2) -> s1.length() - s2.length());
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged by shortest first List using " +
                "Method reference:\n-------------------------------------");
        names.sort(Comparator.comparingInt(String::length));
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged reversed alphabetically List:" +
                "\n-------------------------------------");
        names.sort(Comparator.reverseOrder());
        names.forEach(System.out::println);
        System.out.println("\n=====================================\nArranged by longest first List:" +
                "\n-------------------------------------");
        names.sort((s1, s2) -> s2.length() - s1.length());
        names.forEach(System.out::println);
    }
}

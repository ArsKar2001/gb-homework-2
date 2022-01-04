package ru.gb.homework;

import java.util.*;

public class App {

    public static void main(String[] args) {
        String[] strings = {
                "b",
                "C",
                "A",
                "b",
                "V",
                "C",
                "A",
                "C"
        };

        List<String> list = Arrays.asList(strings);

        System.out.println(list);

        Set<String> set = new HashSet<>(list);

        System.out.println(set);

        for (String s1 : set) {
            int count = 0;
            for (String s2 : list) {
                if (s1.equals(s2))
                    count++;
            }
            System.out.printf("\"%s\" встречается раз: %d\n", s1, count);
        }
    }
}

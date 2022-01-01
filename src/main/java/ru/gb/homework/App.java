package ru.gb.homework;

import ru.gb.homework.exceplions.MyArrayDataException;
import ru.gb.homework.exceplions.MyArraySizeException;

import java.util.Scanner;

public class App {

    public static final int SIZE = 4;

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        String[][] strings = new String[4][4];

        for (int i = 0; i < strings.length; i++)
            for (int j = 0; j < strings[i].length; j++) strings[i][j] = scanner.next();

        int sum = app.checkArraySizeAndFindSum(strings);
        System.out.println(sum);
    }

    private int checkArraySizeAndFindSum(String[][] strings) {
        if (strings.length != SIZE) throw new MyArraySizeException(SIZE);

        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length != SIZE) throw new MyArraySizeException(SIZE);
            for (int j = 0; j < strings[i].length; j++) {
                String value = strings[i][j];
                try {
                    sum += new Integer(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(e, value, i, j);
                }
            }
        }
        return sum;
    }
}

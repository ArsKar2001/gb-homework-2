package ru.gb.homework.exceplions;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int size) {
        super("Размер массива не соответвует: " + size);
    }
}

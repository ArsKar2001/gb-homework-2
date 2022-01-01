package ru.gb.homework.exceplions;

/**
 * Exception handler for array data.
 */
public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(Throwable e, String value, int column, int row) {
        super(String.format("В ячейке [%d][%d] вызвано исключение: \"%s\" невозможно преобразовать в число.", column, row, value), e);
    }
}

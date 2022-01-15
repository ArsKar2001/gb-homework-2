package ru.gb.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Phonebook, which stores a list of names and telephone numbers.
 */
public class Phonebook {
    private final LinkedList<Note> notes;

    public Phonebook(Note[] notes) {
        this.notes = new LinkedList<>(Arrays.asList(notes));
    }

    public void add(Note note) {
        notes.addLast(note);
    }

    public List<Note> get(String s) {
        List<Note> nl = notes;
        nl.removeIf(n -> !n.getFirstName().equalsIgnoreCase(s));
        return nl;
    }

    @Override
    public String toString() {
        return notes.toString();
    }
}

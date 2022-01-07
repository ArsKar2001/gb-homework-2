package ru.gb.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class Phonebook, which stores a list of names and telephone numbers.
 */
public class Phonebook {
    private final List<Note> notes;

    public Phonebook(List<Note> notes) {
        this.notes = notes;
    }

    public Phonebook() {
        this.notes = new ArrayList<>();
    }

    public Phonebook(Note[] notes) {
        this.notes = new ArrayList<>(Arrays.asList(notes));
    }

    public void add(Note note) {
        notes.add(note);
    }

    public List<String> get(String s) {
        List<String> list = new ArrayList<>();
        for (Note note : notes)
            if (s.equalsIgnoreCase(note.getFirstName()))
                list.add(note.getPhoneNumber());
        return list;
    }

    @Override
    public String toString() {
        return notes.toString();
    }
}

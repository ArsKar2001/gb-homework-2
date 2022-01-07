package ru.gb.homework;

public class App {

    public static void main(String[] args) {
        Note[] notes = {
                new Note("Карманов", "454545664645"),
                new Note("Карманов", "787878787"),
                new Note("Коркунов", "557676676"),
                new Note("Иванов", "54545"),
                new Note("Коркунов", "7987964565"),
        };

        Phonebook phonebook = new Phonebook(notes);

        System.out.println(phonebook);

        phonebook.add(new Note("Тестов", "12345678"));

        System.out.println(phonebook);


        String search = "Карманов";
        System.out.printf("Поиск по фамилиии \"%s\":\n", search);
        for (String s : phonebook.get(search))
            System.out.println(s);
    }
}

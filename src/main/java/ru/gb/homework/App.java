package ru.gb.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать сколько раз встречается каждое слово.*/
        String[] strings = {
                "b",
                "C",
                "Afg",
                "b",
                "V",
                "C",
                "Afg",
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

        /*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи.
        С помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/
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
        System.out.printf("Поиск номеров по фамилиии \"%s\":\n", search);

        for (Note note : phonebook.get(search)) {
            System.out.println(note.getPhoneNumber());
        }
    }
}

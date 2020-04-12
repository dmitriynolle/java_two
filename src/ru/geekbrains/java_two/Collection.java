package ru.geekbrains.java_two;

import java.util.HashMap;

public class Collection {

    public static void main(String[] args) {
        String text = "Создать массив с набором слов ( 20 - 30 слов , должны встречаться повторяющиеся ) :" +
                " - Найти список слов , из которых состоит текст ( дубликаты не считать ) ;" +
                " - Посчитать сколько раз встречается каждое слово ( использовать HashMap ) ;";
        int i;
        String[] textArray;
        HashMap<String, Integer> textMap = new HashMap<>();
        textArray = text.split(" ");
        System.out.println("Слов в массиве: " + textArray.length);
        for (String s : textArray) {
            if (textMap.containsKey(s)) {
                i = textMap.get(s);
                i++;
                textMap.put(s, i);
            } else textMap.put(s, 1);
        }
        System.out.println("Не повторяющих слов в массиве: " + textMap.size());

        PhoneBook phoneBook = new PhoneBook();
        Person person = new Person("Petrov", "89012356487", "dmitriy@test.ru");
        phoneBook.addRecord(person);
        Person person1 = new Person("Ivanov", "89589356487", "sergey@test.ru");
        phoneBook.addRecord(person1);
        Person person2 = new Person("Petrov", "89012357534", "ivan@test.ru");
        phoneBook.addRecord(person2);

        System.out.println(phoneBook.searchPhone(person.lastName));

        System.out.println(phoneBook.searchEmail(person.lastName));
    }
}

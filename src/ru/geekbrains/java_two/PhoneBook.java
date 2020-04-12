package ru.geekbrains.java_two;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<Person>> items = new HashMap<>();

    public void addRecord(Person person){
        if(items.containsKey(person.lastName))
            items.get(person.lastName).add(person);
        else {
            ArrayList<Person> personList = new ArrayList<>();
            personList.add(person);
            items.put(person.lastName, personList);
        }
    }

    public ArrayList<String> searchPhone(String lastName){
        ArrayList<String> phone = new ArrayList<>();
        for(Person s : items.get(lastName)){
            phone.add(s.phone);
        }
        return phone;
    }

    public ArrayList<String> searchEmail(String lastName){
        ArrayList<String> email = new ArrayList<>();
        for(Person s : items.get(lastName)){
            email.add(s.email);
        }
        return email;
    }
}

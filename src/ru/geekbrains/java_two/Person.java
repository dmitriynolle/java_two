package ru.geekbrains.java_two;

public class Person {

    String lastName;
    String phone;
    String email;

    public Person(String lastName, String phone, String email){
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return lastName + ' ' +  phone + ' ' + email;
    }
}

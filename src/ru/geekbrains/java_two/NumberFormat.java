package ru.geekbrains.java_two;

public class NumberFormat extends NumberFormatException {

    public NumberFormat(){
        super("Строка содержит символы отличные от цифр");
    }
}

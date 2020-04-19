package ru.geekbrains.java_two;

public class MyThread extends Thread {
    float[] arr;
    int h;
    MyThread(float[] arr, int h){
        this.arr = arr;
        this.h = h;
    }

    public void run(){
        MainThread.newArray(arr, h);
    }
}

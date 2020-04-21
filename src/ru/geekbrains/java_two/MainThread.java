package ru.geekbrains.java_two;

public class MainThread {

    public static void main(String[] args) {
        System.out.println("Время работы метода 1: " + SingleTread());
        System.out.println("Время работы метода 2: " + MultiTread());
    }

    private static long SingleTread() {
        final int size = 10000000;
        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        newArray(arr, size);
        return (System.currentTimeMillis() - a);
    }

    private static long MultiTread() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for (int i = 0; i < size; i++) {
            arr[i] = 1f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread p1 = new MyThread(a1, h);
        MyThread p2 = new MyThread(a2, h);
        p1.start();
        p2.start();
        try {
            p1.join();
            p2.join();
        } catch (InterruptedException s) {
            s.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        return (System.currentTimeMillis() - a);
    }

    public static void newArray(float[] arr, int h){
        for (int i = 0; i < h; i++) {
            arr[i] = 1f;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}

package ru.geekbrains.java_two;

public class MainException {
    private static String[][] arr;

    public static void main (String[] args){
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        try{
            strToArr(str);
            System.out.println(arifmetic());
        } catch (NumberFormat | IllegalState e){
            System.out.println(e);
        }
    }

    private static void strToArr(String str) throws IllegalState {
        String[] arrTemp = str.split("\\n");
        arr = new String[arrTemp.length][arrTemp.length];
        for (int i = 0; i < arrTemp.length ; i++) {
            arr[i] = arrTemp[i].split("\\s");
            if (arr.length != arr[i].length || arr.length != 4)
                throw new IllegalState();
        }
    }
    private static int arifmetic() throws NumberFormat{
        int summa = 0;
        int s = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    s = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new NumberFormat();
                }
                summa = summa + s;
            };
        }
        return summa/2;
    }
}
package HomeWorkApp;
// 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;

import java.util.Scanner;

public class less3z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[] array = fileArrae(len);
        printArre (array);
    }

    public static int[] fileArrae(int len) {
        int[] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        int initialValue = scanner.nextInt();
        //len = scanner.nextInt();
        for (int i = 0; i<len; i++){
            array[i]= initialValue;
        }
        return array;

    }

    public static void printArre(int[] array) {
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }

}

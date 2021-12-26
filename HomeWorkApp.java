package HomeWorkApp;

import java.util.Scanner;

public class HomeWorkApp {                       // это класс

    // 1. Задать целочисленный массив, состоящий из элементов
    //   0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void main(String args[]) {
        System.out.println("задание 1");

        int[] mass = new int[14];
        mass[0] = 1;
        mass[1] = 1;
        mass[2] = 0;
        mass[3] = 0;
        mass[4] = 1;
        mass[5] = 1;
        mass[6] = 0;
        mass[7] = 0;
        mass[8] = 0;
        mass[9] = 0;
        mass[10] = 1;
        mass[11] = 1;
        mass[12] = 0;
        mass[13] = 0;
        int i = 0;
        for (i = 0; i <= 13; i++)                 // печать созданного массива
            System.out.print(mass[i]);
        System.out.println();

        for (i = 0; i <= 13; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
                System.out.print(mass[i]);          // печать модерн. массива

            } else {
                mass[i] = 1;
                System.out.print(mass[i]);          // печать модерн. массива (или это)

            }

        }

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;


        System.out.println();
        System.out.println("задание 2");
        int[] arr1 = new int[100];
        for (int j = 0; j < 100; j++) {
            arr1[j] = j + 1;
            System.out.println("arr[" + j + "] = " + arr1[j]);
        }


        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("задание 3");

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int r = 0; r < 12; r++) {
            System.out.print("  " + arr2[r]);
        }
        System.out.println();

        for (int h = 0; h < 12; h++) {
            if (arr2[h] < 6)
                arr2[h] = arr2[h] * 2;

            System.out.print("  " + arr2[h]);

        }

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println();
        System.out.println("задание 4");


        System.out.println();
        int[][] table = new int[5][5];
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if ((x == y) || (y == 4 - x)) {
                    table[x][y] = 1;
                } else {
                    table[x][y] = 0;
                }
                if (y == 4)
                    System.out.println(table[x][y] + " ");
                else
                    System.out.print(table[x][y] + " ");


            }
        }

        // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;


        // решение в файле less3z5


        //6. * Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы ;
        System.out.println("задание 6");
        int[] massiv = {-1, 15, 3, 11, 25, 1051, 4, 555, 2, -324, 8, 9, 111};
        int minlit = massiv[0];
        int maxlit = massiv[0];

        for (int f = 0; f <= 12; f++) {
            if (massiv[f] <= minlit)
                minlit = massiv[f];
            else if (massiv[f] >= maxlit)
                maxlit = massiv[f];
        }

        System.out.print("в массиве {-1, 15, 3, 11, 25, 1051, 4, 555, 2, -324, 8, 9, 111 }:  минимальное значение " + minlit + ",  макимальное значение " + maxlit);


        //7. ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true, если в массиве есть
        // место, в котором сумма левой и правой части массива равны.



        System.out.println();
        System.out.println("задание 7");
        int[] mass1 = {1, 1, 3, 2, 5, 1, 4, 5, 2, 3, 2, 1, 9};
        int w = 0;
        int l1=0;
        int l2=0;
        int balleft=mass1[w];
        int balright =mass1[12 - w];

        while (w < 12) {

            if (balleft == balright) {
                System.out.println("середина найдена    " + balleft + "      и       " + balright);
                System.out.println("сумма   " + (l1+1) + "   элеметов справа, и    " + (l2+1)+  "   элеметов слева   ");
                return;
            } else if (balleft > balright) {
                l1++;
                balright = balright + mass1[12 - l1];
            } else if (balleft < balright) {
               l2++;
                balleft = balleft + mass1[l2];
            }
            w++;

        }
        System.out.println("равнозначная середина массива отсутствует");



        //8. *** Написать метод, которому на вход подается одномерный массив
        // и число n (может быть положительным, или отрицательным), при этом
        // метод должен сместить все элементы массива на n позиций. Элементы
        // смещаются циклично. Для усложнения задачи нельзя пользоваться
        // вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
        // (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
        // -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        System.out.println();
        System.out.println("задание 8");


     /*   int[] mass2 = {177, 881, 3, 2, 5, 144, 355, 772, 1, 12};  // 10 элементов
        Scanner scanner = new Scanner(System.in);
        int shift = scanner.nextInt();
        System.out.println();
        int c =0;
        for (int lll = 0; lll < shift; lll ++){
            for (int v=9; v > 0; v--){
                if ((9-v) == 9){
                    mass2[v] = mass2[9-(c)];
                    System.out.print(mass2[v]+ "   ");
                    c++;
                } else if (v < 9) {
                    mass2[v] = mass2[c];
                    System.out.print(mass2[v]+ "   ");
                    v++;}
            }
        }*/
    }
}































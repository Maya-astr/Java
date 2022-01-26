package HomeWorkApp5;
import java.util.Random;
import java.util.Scanner;

public class HWAKrestNulPrepod4 {                 // ниже объявлены глобальные переменные
    private final static int SIZE = 3; // размер игрового поля (final- указывает на финализированная константа, не меняемая на протяжении всего кода)
    private final static char DOT_EMPTY = '.';
    private final static char DOT_X ='X';
    private final static char DOT_0 ='0';
    private static char[][] MAP= new char[SIZE][SIZE];    // ИЛИ ТАК private static char[][] MAP= new char[SIZE][SIZE];
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {//проверка после хода- победил ли человек
                System.out.println("Победил человек");
                break;
            }
            if (isMaapFull()){ //проверка - наступила ли ничья?
                System.out.println("Ничья");
                break;
            }
            aiTurn();;
            printMap();;
            if(checkWin(DOT_0)) {                   //проверка-победил ли комп
                System.out.println("Победил ИИ");
                break;
            }
            if(isMaapFull()) {
                System.out.println("Ничья");// если карта полностью заполнена, -ничья
                break;
            }
        }
        System.out.println("Игра окончена");
        SCANNER.close();                    //закрытие игры


    }
    private static boolean checkWin(char symbl){    //проверка на победу
        if (MAP[0][0] == symbl && MAP[0][1] == symbl && MAP[0][2] == symbl)   //проверка строки
            return true;
        if (MAP[1][0] == symbl && MAP[1][1] == symbl && MAP[1][2] == symbl)  //проверка строки
            return true;
        if (MAP[2][0] == symbl && MAP[2][1] == symbl && MAP[2][2] == symbl)  //проверка строки
            return true;
        if (MAP[0][0] == symbl && MAP[1][0] == symbl && MAP[2][0] == symbl)  //проверка столбца
            return true;
        if (MAP[0][1] == symbl && MAP[1][1] == symbl && MAP[2][1] == symbl)  //проверка столбца
            return true;
        if (MAP[0][2] == symbl && MAP[1][2] == symbl && MAP[2][2] == symbl)  //проверка столбца
            return true;
        if (MAP[0][0] == symbl && MAP[1][1] == symbl && MAP[2][2] == symbl)  //проверка диагонали
            return true;
        if (MAP[2][0] == symbl && MAP[1][1] == symbl && MAP[0][2] == symbl)  //проверка диагонали
            return true;
        return false;
    }

    public static boolean isMaapFull() {  // метод- полностью ли заполнена карта?
        for (int i =0; i<SIZE; i++){
            for (int j =0; j<SIZE; j++){
                if (MAP[i][j] == DOT_EMPTY){ //если в массиве есть хотябы одна точка, - значим массив не заполнен полностью
                    return false;
                }
            }
        }
        return true;

    }
    private static void aiTurn(){   // ход компьютера
        int x;
        int y;
        int count = 1;
         do {
             x= RANDOM.nextInt(SIZE);
             y= RANDOM.nextInt(SIZE);  // рандом координат на поле, куда идет комьютер
             System.out.println(count); // может быть много попыток, пока комп не сгенерирует последнюю координату
             count++;
         } while (!isCellValid(x, y));
        System.out.println("Выполнен ход комьютера в точку "+ (x+1)+ " " + (y+1));
        MAP [y][x] = DOT_0;



    }


    private static void humanTurn(){
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате Х и У"); // ход человека -ввод двух координат -х и у
            x= SCANNER.nextInt() - 1;
            y= SCANNER.nextInt() - 1;
        } while (!isCellValid(x,y));

        MAP [y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {  // после хода метод проверяет можно ли ходить в данную ячейку(точку)
        if (x<0 || x>=SIZE || y<0|| y>SIZE){
            return  false;
        }
        if (MAP[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }
    public static void initMap() {
        for (int i = 0; i <SIZE; i++){
            for (int j  = 0; j<SIZE; j++){
                MAP[i][j] = DOT_EMPTY;

            }
        }

    }
    public static void printMap() {
        for (int i=0; i<=SIZE; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0; i<SIZE; i++){                 // выводим карту с точками на экран- отрисовка
            System.out.print((i+1) + " ");
            for (int j= 0; j< SIZE; j++){
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static class HomeWorkApp1 {                       // это класс

        // 1. Задать целочисленный массив, состоящий из элементов
        //   0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //  С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static void main1(String args[]) {
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
        }
        public static void main2 (String args[]){

            //2. Задать пустой целочисленный массив длиной 100.
            // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;


            System.out.println();
            System.out.println("задание 2");
            int[] arr1 = new int[100];
            for (int j = 0; j < 100; j++) {
                arr1[j] = j + 1;
                System.out.println("arr[" + j + "] = " + arr1[j]);
            }
        }
        public static void main3 (String args[]){

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
        }
        public static void main4 (String args[]){
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
        }

            // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
            // и возвращающий одномерный массив типа int длиной len,
            // каждая ячейка которого равна initialValue;


            // решение в файле less3z5
        public static void main6 (String args[]) {

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
        }
        public static void main7 (String args[]) {

            //7. ** Написать метод, в который передается не пустой одномерный
            // целочисленный массив, метод должен вернуть true, если в массиве есть
            // место, в котором сумма левой и правой части массива равны.


            System.out.println();
            System.out.println("задание 7");
            int[] mass1 = {1, 1, 3, 2, 5, 1, 4, 5, 2, 3, 2, 1, 9};
            int w = 0;
            int l1 = 0;
            int l2 = 0;
            int balleft = mass1[w];
            int balright = mass1[12 - w];

            while (w < 12) {

                if (balleft == balright) {
                    System.out.println("середина найдена    " + balleft + "      и       " + balright);
                    System.out.println("сумма   " + (l1 + 1) + "   элеметов справа, и    " + (l2 + 1) + "   элеметов слева   ");
                    break;
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


        }
        public static void main8 (String args[]){
            //8. *** Написать метод, которому на вход подается одномерный массив
            // и число n (может быть положительным, или отрицательным), при этом
            // метод должен сместить все элементы массива на n позиций. Элементы
            // смещаются циклично. Для усложнения задачи нельзя пользоваться
            // вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
            // (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
            // -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
            System.out.println();
            System.out.println("задание 8");
            int[] mass2 = {177, 881, 3, 2, 5, 144, 355, 772, 1, 12};  // 10 элементов
            Scanner scanner = new Scanner(System.in);
            int shift = scanner.nextInt();  //вводим с клав.количество сдвигов
            System.out.println();
            int c =0;
            int t=0;
            for (int lll = 0; lll < shift; lll ++){
                System.out.println();
                for (int v=9; v > -1; v--) {
                    if (v>0){
                        if (v==9){
                            t = mass2[v];
                            mass2 [v] = mass2 [v-1];
                        }
                        else {
                            mass2[v] = mass2[v - 1];
                        }
                    }
                    else if (v==0)
                        mass2 [v] =t;
                }
                for (c = 0; c < 10; c++)                 // печать созданного массива
                    System.out.print(mass2[c]+ "   ");
                System.out.println();
            }
            System.out.println("****************************************");
            System.out.println();
            System.out.println("задание 8");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("ввести количество сдвигов матрицы");
            int shift1 = scanner.nextInt();  //вводим с клав.количество сдвигов+
            System.out.println("ввести количество элементов матрицы");
            int sizeM = scanner.nextInt(); // вводим количество чисел матрицы
            System.out.println("ввести поочередно элемент матрицы, начиная с 0");

            int[] mass4 = new int[sizeM];
            for (int q = 0; q < (sizeM); q++){
                mass4[q]  = (int)(Math.random()*100);
                System.out.print(mass4[q]+"   " );
            }
            System.out.println();
            System.out.println("матрица из " +sizeM+ " элементов сдвигается "  +shift1+  "  раз(а) ");
            System.out.println();

            for (int lll = 0; lll < shift1; lll ++){
                System.out.println();
                for (int v=sizeM-1; v > -1; v--) {
                    if (v>0){
                        if (v==sizeM-1){
                            t = mass4[v];
                            mass4 [v] = mass4 [v-1];
                        }
                        else {
                            mass4[v] = mass4[v - 1];
                        }
                    }
                    else if (v==0)
                        mass4 [v] =t;
                }
                for (int cc = 0; cc < sizeM; cc++)                 // печать созданного массива
                    System.out.print(mass4[cc]+ "   ");
                System.out.println();
            }
        }
    }

    public static class HomeWorkApp2 {
        public static void main(String[] args) {
            //Написать метод, принимающий на вход два целых числа и проверяющий, что их
            // сумма лежит в пределах от 10 до 20 (включительно),
            // если да – вернуть true, в противном случае – false.
            System.out.println("задание 1");
            int number = 115;
            int numb = -200;
            int summ = number + numb;
            if (summ>=10 & summ <=20)
                System.out.println(true);
            else
                System.out.println(false);


            // Написать метод, которому в качестве параметра передается целое число, метод должен
            // напечатать в консоль, положительное ли число передали или отрицательное.
            // Замечание: ноль считаем положительным числом.
            System.out.println("задание 2");

            int n1 = 100015;
            if (n1>=0)
                System.out.println(" число  " + n1 + " положительное ");
            else
                System.out.println(" число  " + n1 + " отрицательное ");


            // Написать метод, которому в качестве параметра передается целое число.
            // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
            System.out.println("задание 3");
            int n2 = -25;
            if (n2>=0)
                System.out.println(false);
            else
                System.out.println(true);
            //Написать метод, которому в качестве аргументов передается строка и число,
            // метод должен отпечатать в консоль указанную строку, указанное количество раз;
            System.out.println("задание 4");
            String parol = " я люблю тебя, жизнь!";
            int nn = 7;
            for (int n3=1; n3<= nn; n3++)
                System.out.println(parol);


            // Написать метод, который определяет, является ли год високосным,
            // и возвращает boolean (високосный - true, не високосный - false).
            // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
            System.out.println("задание 5");
            int year = 0;
            for (year = 0; year<= 2000; year++){
                System.out.println(year);
                if ((year % 4 == 0)  &  (year % 100 != 0) || (year % 400 == 0))
                    System.out.println(true);
                else
                    System.out.println(false);



            }



        }


    }

    public static class HomeWorkAppMassiv3Modern {
        public static void main(String[] args) {
            //Написать метод, принимающий на вход два целых числа и проверяющий, что их
            // сумма лежит в пределах от 10 до 20 (включительно),
            // если да – вернуть true, в противном случае – false.
            System.out.println("задание 1");
            int number = 115;
            int numb = -200;
            int summ = number + numb;
            if (summ>=10 & summ <=20)
                System.out.println(true);
            else
                System.out.println(false);


            // Написать метод, которому в качестве параметра передается целое число, метод должен
            // напечатать в консоль, положительное ли число передали или отрицательное.
            // Замечание: ноль считаем положительным числом.
            System.out.println("задание 2");

            int n1 = 100015;
            if (n1>=0)
                System.out.println(" число  " + n1 + " положительное ");
            else
                System.out.println(" число  " + n1 + " отрицательное ");


            // Написать метод, которому в качестве параметра передается целое число.
            // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
            System.out.println("задание 3");
            int n2 = -25;
            if (n2>=0)
                System.out.println(false);
            else
                System.out.println(true);
            //Написать метод, которому в качестве аргументов передается строка и число,
            // метод должен отпечатать в консоль указанную строку, указанное количество раз;
            System.out.println("задание 4");
            String parol = " я люблю тебя, жизнь!";
            int nn = 7;
            for (int n3=1; n3<= nn; n3++)
                System.out.println(parol);


            // Написать метод, который определяет, является ли год високосным,
            // и возвращает boolean (високосный - true, не високосный - false).
            // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
            System.out.println("задание 5");
            int year = 0;
            for (year = 0; year<= 2000; year++){
                System.out.println(year);
                if ((year % 4 == 0)  &  (year % 100 != 0) || (year % 400 == 0))
                    System.out.println(true);
                else
                    System.out.println(false);



            }



        }


    }

    public static class HomeWorkAppMassiv3 {
        public static void main(String[] args) {
            //Написать метод, принимающий на вход два целых числа и проверяющий, что их
            // сумма лежит в пределах от 10 до 20 (включительно),
            // если да – вернуть true, в противном случае – false.
            System.out.println("задание 1");
            int number = 115;
            int numb = -200;
            int summ = number + numb;
            if (summ>=10 & summ <=20)
                System.out.println(true);
            else
                System.out.println(false);


            // Написать метод, которому в качестве параметра передается целое число, метод должен
            // напечатать в консоль, положительное ли число передали или отрицательное.
            // Замечание: ноль считаем положительным числом.
            System.out.println("задание 2");

            int n1 = 100015;
            if (n1>=0)
                System.out.println(" число  " + n1 + " положительное ");
            else
                System.out.println(" число  " + n1 + " отрицательное ");


            // Написать метод, которому в качестве параметра передается целое число.
            // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
            System.out.println("задание 3");
            int n2 = -25;
            if (n2>=0)
                System.out.println(false);
            else
                System.out.println(true);
            //Написать метод, которому в качестве аргументов передается строка и число,
            // метод должен отпечатать в консоль указанную строку, указанное количество раз;
            System.out.println("задание 4");
            String parol = " я люблю тебя, жизнь!";
            int nn = 7;
            for (int n3=1; n3<= nn; n3++)
                System.out.println(parol);


            // Написать метод, который определяет, является ли год високосным,
            // и возвращает boolean (високосный - true, не високосный - false).
            // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
            System.out.println("задание 5");
            int year = 0;
            for (year = 0; year<= 2000; year++){
                System.out.println(year);
                if ((year % 4 == 0)  &  (year % 100 != 0) || (year % 400 == 0))
                    System.out.println(true);
                else
                    System.out.println(false);



            }



        }


    }
}

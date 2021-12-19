package HomeWorkApp;

public class HomeWorkApp {                       // это класс


    public static void main(String[] args) {    // это метод

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


        //public static void checkSumSign() {     // это метод
        int a = 14;
        int b = -15;
        int summ = a + b;
        if (summ > 0) {
            System.out.println("сумма чисел а и в положительная");
        } else {
            System.out.println("сумма чисел а и в отрицательная");
        }

        //}

        //public static void printColor() {    // это метод
        int value = 140;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0 & value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

        // }

        //public static void compareNumbers() {
        a = 14;
        b = -15;
        if (a > b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        //}
    }
}












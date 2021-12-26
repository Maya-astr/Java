package HomeWorkApp;

public class HomeWorkAppMassiv3 {
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

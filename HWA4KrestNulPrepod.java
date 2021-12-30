package HomeWorkApp;
import java.util.Random;
import java.util.Scanner;

public class HWA4KrestNulPrepod {                 // ниже объявлены глобальные переменные
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
}

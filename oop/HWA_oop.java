package HomeWorkApp5.oop;

public class HWA_oop {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Навальный А.В.", "Начальник", "iiivanov@mail.ru",892788323,150000,50);
        Employee Employee2 = new Employee("Ройзман Е.В.","Зам.начальника","marfina-z@mail.ru", 89235566, 3100000,39);
        Employee Employee3 = new Employee("Соловей В.М.", "Политолог","monterov-sergey@mail.ru",89266578,60000,65);
        Employee Employee4 = new Employee("Быков Д.И.","Журналист","sergeev-f@mail.ru",8275860,50000,48);
        Employee Employee5 = new Employee("Невзоров А.Г.","Мастер","sergeev-n@mail.ru",89255885, 50000,63);

        Employee[] emplArrey =new Employee[5];
        emplArrey[0] =new Employee("Навальный А.В.", "Начальник", "iiivanov@mail.ru",892788323,150000,50);
        emplArrey[1] =new Employee("Ройзман Е.В.","Зам.начальника","marfina-z@mail.ru", 89235566, 3100000,39);
        emplArrey[2] =new Employee("Соловей В.М.", "Политолог","monterov-sergey@mail.ru",89266578,60000,65);
        emplArrey[3] =new Employee("Быков Д.И.","Журналист","sergeev-f@mail.ru",8275860,50000,48);
        emplArrey[4]=new Employee("Невзоров А.Г.","Мастер","sergeev-n@mail.ru",89255885, 50000,63);

        for (int i = 0; i < 5; i++){
            if (emplArrey[i].emplyeeAge >= 40){
                System.out.println("Сотруднику   " + emplArrey[i].lastNameFirstNamePatronymic  +"  больше сорока лет");
            }
        }
    }
}

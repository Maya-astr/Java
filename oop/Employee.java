package HomeWorkApp5.oop;
/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Employee {
    public String lastNameFirstNamePatronymic;
    public String post;
    public String email;
    public int phoneNumber;
    public int salary;
    public int emplyeeAge;


    public Employee(String lastNameFirstNamePatronymic, String post, String email, int phoneNumber, int salary, int emplyeeAge) {
        this.lastNameFirstNamePatronymic = lastNameFirstNamePatronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.emplyeeAge = emplyeeAge;
    }
}









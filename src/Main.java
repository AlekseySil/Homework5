import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы ввели не коректные данные");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 0 если ваша операционная система iOS, 1 если Android");
        int clientOS = in.nextInt();
        System.out.println("Введите год выпуска Вашего телефона");
        int clientDeviceYear = in.nextInt();

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосный");
        }else{
            System.out.println(year + " год ялвяется простым");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние до вашего дома: ");
        int deliveryDistance = in.nextInt();
        int day = 1;
        int day_2= 2;
        int day_3 = 3;

        if(deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + day );
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + day_2);
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + day_3);
        }else{
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = in.nextInt();

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
                break;
            default:
                System.out.println("Некоректный месяц");
        }
    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        int clientiOS = 0;
        int clientAndroid = 1;
        if  (clientiOS == clientOS){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientAndroid == clientOS){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");
        int year = 2021;
        int a = year % 400;
        int b = year % 100;
        int c = year % 4;
        if (year > 1584 && c == 0 && b != 0 || a == 0) {
            System.out.println( year + " год является високосным!");
        } else {
            System.out.println(year + " год не являеться високосным");
        }

        System.out.println("Задание 4");
        int deliveriDistance = 105;
        int intervalA = 20;
        int intervalB = intervalA+40;
        int intervalC = intervalB+40;
        int dayA = 1;
        int dayB = 2;
        int dayC = 3;
        if (deliveriDistance <= intervalA) {
            System.out.println("Потребуется дней: " + dayA);}
        if (deliveriDistance > intervalA && deliveriDistance <= intervalB) {
            System.out.println("Потребуется дней: " + dayB);
        } else if (deliveriDistance > intervalB && deliveriDistance < intervalC){
            System.out.println("Потребуется дней: " + dayC);
        } else { System.out.println("Доставка не осуществляется");}

        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
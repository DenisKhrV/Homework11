import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        checkYear(year);
    }
    public static String checkDevice (int osType, int deviceYear) {
        String message;
        int currentYear = LocalDate.now().getYear();
        if (osType == 1 && deviceYear < currentYear ) {
            message = "Установите облегченную версию приложения для Android по ссылке";
        } else if (osType == 1 && deviceYear == currentYear) {
            message = "Установите версию приложения для Android по ссылке";
        } else if (osType == 0 && deviceYear < currentYear ) {
            message = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (osType == 0 && deviceYear == currentYear) {
            message = "Установите версию приложения для iOS по ссылке";
        } else {
            message = "Ваша OS не поддерживается";
        }
        return message;
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int clientOsType = 0;
        int clientDeviceYear = 2022;
        System.out.println(checkDevice(clientOsType, clientDeviceYear));

    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 20) {
            return days;
        } else if (deliveryDistance <= 60) {
            days+=1;
        } else  {
            days+=2;
        }
        return days;
    }
    public static void task3() {
        System.out.println("\nЗадача 3");
        short deliveryDistance = 117;

        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + calculateDeliveryTime(deliveryDistance));
        }
    }
}
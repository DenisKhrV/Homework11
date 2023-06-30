import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();

    }

    public static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        if (checkYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static String checkOsType (int osType, int deviceYear) {
        String message;
        if (osType == 1) {
            message = "Android";
        } else if (osType == 0) {
                  message = "iOS";
        } else {
                  message = "Не поддерживается";
        }

        return message;
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int clientOsType = 0;
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2022;
        System.out.println(checkOsType(clientOsType, clientDeviceYear));

//        byte clientOS = 2;
//        int iOs=0;
//        int Android=1;
//        short clientDeviceYear = 2016;
//        int checkYear = 2015;
//        if (clientOS == iOs && clientDeviceYear < checkYear) {
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        }else if (clientOS == iOs && clientDeviceYear >= checkYear) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        }else if (clientOS == Android && clientDeviceYear < checkYear) {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        }else if (clientOS == Android && clientDeviceYear >= checkYear) {
//            System.out.println("Установите версию приложения для Android по ссылке");
//        }else {
//            System.out.println("Ваша OS не поддерживается");
//        }

    }
}
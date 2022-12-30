import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("    Год високосный");
                }
                else
                {
                    System.out.println("    Год не високосный");
                }
            }
            else
            {
                System.out.println("    Год високосный");
            }
        }
        else
        {
            System.out.println("    Год не високосный");
        }
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        int year = 2022;
        checkYear(year);
    }

    public static void checkSystem(int clientOS)
    {
        int clientDeviceYear = 2022;
        if (clientDeviceYear >= 2015 && clientOS == 0)
        {
            System.out.println("    Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 1)
        {
            System.out.println("    Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 0)
        {
            System.out.println("    Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1)
        {
            System.out.println("    Установите облегченную версию приложения для Android по ссылке");
        }
        else
        {
            System.out.println("    Некорректный ввод");
        }
    }
    public static void task2 ()
    {
        System.out.println("Задача 2");
        int clientOS = 1;
        checkSystem(clientOS);
    }

    public static int checkDayDelivery(int deliveryDistance)
    {
        byte delyvery = 1;
        if (deliveryDistance > 20)
        {
            delyvery = (byte)(delyvery + 1);
            if (deliveryDistance > 60)
            {
                delyvery = (byte)(delyvery + 1);
                if (deliveryDistance > 100)
                {
                    delyvery = (byte)(delyvery + 1);
                }
            }
        }
        return delyvery;
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int day = checkDayDelivery(deliveryDistance);
        if (day < 4)
        {
            System.out.println("    Потребуется дней: " + day);
        }
        else
        {
            System.out.println("    Доставки нет");
        }
    }
}
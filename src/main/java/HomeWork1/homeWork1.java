package HomeWork1;

import java.util.GregorianCalendar;

public class homeWork1 {

    //Задание №3
    static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Задание №4
    static boolean task4(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void task5(int value) {
        // если параметр велью больше нуля вывести Положительное
        // иначе если параметр равен нулю вывести Ноль
        // иначе вывести Отрицательное
        if (value > 0) {
            System.out.println("Положительное");
        } else if (value == 0) {
            System.out.println("Ноль");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //Задание №6
    static boolean task6(int x) {
        return x <= 0;
    }

    //Задание №7
    static void task7(String name) {
        System.out.println("Привет, " + name);
    }

    public static void  main(String[] args) {
        System.out.println("Задание №3 = " + task3(5f, 10f,12f,15.6f));
        System.out.println("Задание №4 = " + task4(10, 7));
        System.out.print("Задание №5  = ");
        task5(5);
        System.out.println("Задание №6 = " + task6(-6));
        System.out.print("Задание №7  = ");
        task7("Ramil");
    }
}

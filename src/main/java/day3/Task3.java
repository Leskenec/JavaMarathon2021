package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 2 числа");

        int i = 0;
        while (i < 5) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            i++;
            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;

        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.println(i);
            i++;
        }
        if (i > b)
            System.out.println("Некорректный ввод");
    }
}

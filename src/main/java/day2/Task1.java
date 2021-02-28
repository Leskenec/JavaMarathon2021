package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        if (i >= 1 && i < 5) {
            System.out.println("Малоэтажный дом");
        } else if (i > 4 && i < 9) {
            System.out.println("Снеднеэтажный дом");
        } else if (i > 8) {                                // про максимальную этажность ничего не
            System.out.println("Многоэтажный дом");       // говорится в заданий, потому и бесконечность
        } else {
            System.out.println("Вы ввели неправильное число");
        }
    }
}

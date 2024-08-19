package TernaryOperator;

import java.util.Scanner;

/**
 * 1. Запросить 2 числа и вывести большее из них.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int digit1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int digit2 = sc.nextInt();

        int max = digit1 > digit2 ? digit1 : digit2;

        System.out.println("Большее число = " + max);
    }
}

package TernaryOperator;

import java.util.Scanner;

/**
 * 2. Запросить 1 число и проверить, оно кратно 5 или нет.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = sc.nextInt();

        System.out.println(input % 5 == 0 ? "Число кратно 5" : "Числа не кратно 5");
    }
}

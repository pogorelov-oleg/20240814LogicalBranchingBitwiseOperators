package If;

import java.util.Scanner;

/**
 * 1. Запросить у пользователя число и определить, оно положительное, отрицательное или ноль.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = sc.nextInt();

        if (input > 0) System.out.printf("Число %d положительное", input);
        else if (input < 0) System.out.printf("Число %d отрицательное", input);
        else System.out.println("Вы ввели ноль");
    }
}

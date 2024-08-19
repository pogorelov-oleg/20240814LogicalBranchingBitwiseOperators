package If;

import java.util.Scanner;

/**
 * 2. Запросить у пользователя его возраст и проверить корректность введенных данных (0–120 лет).
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("Введите возраст от 0 до 120 лет");
            int age = sc.nextInt();
            if (age >= 0 && age <= 120) {
                System.out.println("Корректно");
                flag = true;
            } else System.out.println("\u001B[31mвы ввели некорректный возраст\u001B[0m");
        }
    }
}

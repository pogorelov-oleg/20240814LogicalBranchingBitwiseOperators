package If;

import java.util.Scanner;

/**
 * 3. Запросить у пользователя число и вывести его модуль
 * (|7| = 7, |-7| = 7).
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int userInput = sc.nextInt();
        int userInputMod;

        if (userInput < 0) userInputMod = userInput * -1;
        else userInputMod = userInput;
        System.out.printf("|%d| = %d\n", userInput, userInputMod);
    }
}

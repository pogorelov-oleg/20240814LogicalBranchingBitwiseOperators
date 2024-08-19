import java.util.Scanner;

/**
 * 1. Пользователь вводит с клавиатуры число. Необходимо проверить его на четность и нечетность. Если число
 * четное требуется вывести на экран число и надпись «Even
 * number». Если число нечетное выведите на экран число
 * и надпись «Odd number».
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = sc.nextInt();

        System.out.println(input % 2 == 0 ? "Even number" : "Odd number");

    }
}

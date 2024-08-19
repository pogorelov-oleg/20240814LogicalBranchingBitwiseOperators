import java.util.Scanner;

/**
 * 5. Пользователь с клавиатуры вводит количество часов.
 * Если полученное значение находится в диапазоне от 0 до
 * 6 нужно вывести надпись «Good Night», если в диапазоне
 * от 6 до 13 «Good Morning», если в диапазоне от 13 до 17
 * «Good Day», если в диапазоне от 17 до 0 «Good Evening».
 * Верхняя граница диапазона не включается. Например,
 * число 6 относится к 6 до 13.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("Введите количество часов");
            int userInput = sc.nextInt();
            if (userInput >= 0 && userInput < 6) {
                System.out.println("Good night");
                flag = true;
            } else if (userInput >= 6 && userInput < 13) {
                System.out.println("Good morning");
                flag = true;
            } else if (userInput >= 13 && userInput < 17) {
                System.out.println("Good day");
                flag = true;
            } else if (userInput >= 17 && userInput < 24) {
                System.out.println("Good morning");
                flag = true;
            } else System.out.println("\u001B[31mВы ввели неверное время.\u001B[0m");
        }
    }
}

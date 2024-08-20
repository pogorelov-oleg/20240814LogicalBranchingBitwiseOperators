package TernaryOperator;

import java.util.Scanner;

/**
 * 3. Запросить у пользователя название планеты. Если пользователь ввел «Земля» или «земля», то вывести «Привет,
 * землянин!», в остальных случаях вывести «Привет, инопланетянин!».
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название планеты: ");
        String input = sc.next().toLowerCase();

        System.out.println(input.equals("земля") ? "Привет, землялин!" : "Привет, инопланетянин!");
    }
}

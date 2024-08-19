package Switch;

import java.util.Scanner;

/**
 * 1. Запросить у пользователя номер месяца и вывести на экран
 * его название.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.print("Введите номер месяца: ");
            int month = sc.nextInt();

            if (!(month < 1 || month > 12)) {
                switch (month) {
                    case 1:
                        System.out.println("январь");
                        break;
                    case 2:
                        System.out.println("февраль");
                        break;
                    case 3:
                        System.out.println("март");
                        break;
                    case 4:
                        System.out.println("апрель");
                        break;
                    case 5:
                        System.out.println("май");
                        break;
                    case 6:
                        System.out.println("июнь");
                        break;
                    case 7:
                        System.out.println("июль");
                        break;
                    case 8:
                        System.out.println("август");
                        break;
                    case 9:
                        System.out.println("сентябрь");
                        break;
                    case 10:
                        System.out.println("октябрь");
                        break;
                    case 11:
                        System.out.println("ноябрь");
                        break;
                    case 12:
                        System.out.println("декабрь");
                        break;
                }
                flag = true;
            } else System.out.println("\u001B[31mТакого месяца не существует\u001B[0m");
        }
    }
}

package If;

import java.util.Scanner;

/**
 * 4. Запросить у пользователя время (часы, минуты, секунды)
 * и проверить корректность введенных данных.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите часы: ");
        int h = sc.nextInt();
        System.out.print("Введите минуты: ");
        int m = sc.nextInt();
        System.out.print("Введите секунды: ");
        int s = sc.nextInt();
        boolean hBool = true;
        boolean mBool = true;
        boolean sBool = true;

        if (!(h >= 0 && h < 24)) hBool = false;
        if (!(m >= 0 && m < 60)) mBool = false;
        if (!(s >= 0 && s < 60)) sBool = false;

        if (hBool && mBool && sBool) System.out.printf("%d:%d:%d", h, m, s);
        else System.out.println("\u001B[31mВы ввели неверное время.\u001B[0m");
    }
}

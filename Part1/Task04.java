import java.util.Scanner;

/**
 * 4. Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
 * переводит метры в мили, дюймы или ярды.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество метров");
        int m = sc.nextInt();
        boolean flag = false;

        while (!flag) {
            System.out.println("Для перевода в мили нажмите 1, в дюймы 2, " +
                    "в ярды 3");
            int switchMath = sc.nextInt();
            if (switchMath == 1) {
                double result = m / 1609.34;
                System.out.printf("метры:%d - мили:%f", m, result);
                flag = true;
            } else if (switchMath == 2) {
                double result = m / 0.0254;
                System.out.printf("метры:%d - дюймы:%f", m, result);
                flag = true;
            } else if (switchMath == 3) {
                double result = m / 0.9144;
                System.out.printf("метры:%d - ярды:%f", m, result);
                flag = true;
            } else System.out.println("\u001B[31mВы ввели неверную команду.\u001B[0m");
        }
    }
}

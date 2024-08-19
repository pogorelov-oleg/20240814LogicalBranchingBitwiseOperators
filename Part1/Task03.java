import java.util.Scanner;

/**
 * 3. Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        boolean flag = false;

        while (!flag) {
            System.out.println("Для вывода максимального числа нажмите 1, для минимального 2, " +
                    "для среднего арифметического 3");
            int switchMath = sc.nextInt();
            if (switchMath == 1) {
                int max = num1;
                if (num2 > max) max = num2;
                if (num3 > max) max = num3;
                System.out.println("Максимальное число = " + max);
                flag = true;
            } else if (switchMath == 2) {
                int min = num1;
                if (num2 < min) min = num2;
                if (num3 < min) min = num3;
                System.out.println("Минимальное число = " + min);
                flag = true;
            } else if (switchMath == 3) {
                double result = (num1 + num2 + num3) / 3d;
                System.out.println("Среднее арифметическое трех чисел = " + result);
                flag = true;
            } else System.out.println("\u001B[31mВы ввели неверную команду.\u001B[0m");
        }
    }
}

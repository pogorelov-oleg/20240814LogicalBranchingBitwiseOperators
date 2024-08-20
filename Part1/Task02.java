import java.util.Scanner;

/**
 * 2. Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран сумму трёх чисел или произведение трёх чисел.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();
        boolean flag = false;

        while (!flag) {
            System.out.println("Для суммы трех чисел введите 1, для произведения трех чисел введите 2");
            int switchMath = sc.nextInt();
            if (switchMath == 1) {
                System.out.println("Сумма чисел = " + (num1 + num2 + num3));
                flag = true;
            } else if (switchMath == 2) {
                System.out.println("Произведение чисел = " + num1 * num2 * num3);
                flag = true;
            } else System.out.println("\u001B[31mВы ввели неверную команду.\u001B[0m");
        }
    }
}

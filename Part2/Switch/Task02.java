package Switch;

import java.util.Scanner;

/**
 * 2. Реализовать калькулятор. Пользователь вводит 2 числа и
 * знак (+ - * /). В зависимости от введенного знака решить
 * пример и вывести результат.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int digit1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int digit2 = sc.nextInt();
        boolean flag = false;

        while (!flag) {
            System.out.print("Введите какую математическую операцию вы хотите совершить (+,-,*,/): ");
            String option = sc.next();
            if (option.equals("+") || option.equals("-") || option.equals("*") || option.equals("/")) {
                double result;
                switch (option) {
                    case "+":
                        result = digit1 + digit2;
                        System.out.println(digit1 + " + " + digit2 + " = " + result);
                        break;
                    case "-":
                        result = digit1 - digit2;
                        System.out.println(digit1 + " - " + digit2 + " = " + result);
                        break;
                    case "*":
                        result = digit1 * digit2;
                        System.out.println(digit1 + " * " + digit2 + " = " + result);
                        break;
                    case "/":
                        result = (double) digit1 / digit2;
                        System.out.println(digit1 + " / " + digit2 + " = " + result);
                        break;
                }
                flag = true;
            } else System.out.println("\u001B[31mВы ввели неверную математическую операцию\u001B[0m");
        }
    }
}

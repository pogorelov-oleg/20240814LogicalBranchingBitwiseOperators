package If;

import java.util.Scanner;

/**
 * 5. Запросить координаты точки (x, y) и определить номер
 * четверти, в которую попала эта точка. Необходимо учесть
 * случаи попадания точки на оси X или Y или в начало
 * координат.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        int x = sc.nextInt();
        System.out.print("Введите значение y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) System.out.println("Координата находится в начале координат");
        else if (x == 0 && y != 0) System.out.println("Координата находится на оси x");
        else if (x != 0 && y == 0) System.out.println("Координата находится на оси y");
        else if (x > 0 && y > 0) System.out.println("Координата находится  I четверти");
        else if (x < 0 && y > 0) System.out.println("Координата находится  II четверти");
        else if (x < 0 && y < 0) System.out.println("Координата находится  III четверти");
        else if (x > 0 && y < 0) System.out.println("Координата находится  IV четверти");
    }
}

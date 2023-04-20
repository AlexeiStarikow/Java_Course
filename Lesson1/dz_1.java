// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Lesson1;

import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.printf("Введите число n: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

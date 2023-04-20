package Lesson1;

import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите операцию + - / *: ");
        char operation = sc.next().charAt(0);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        if (operation == '+') {
            System.out.println((num1 + num2));
        } else if (operation == '-') {
            System.out.println((num1 - num2));
        } else if (operation == '*') {
            System.out.println((num1 * num2));
        } else if (operation == '/') {
            System.out.println((num1 / num2));
        } else {
            System.err.println("Неверная операция.");
        }
    }
}

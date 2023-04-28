// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.

package Lesson3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(10);
                numbers.add(x);
            }
            System.out.println(numbers);
            int min = numbers.get(0);
            int max = numbers.get(0);
            int mid = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < min) {
                    min = numbers.get(i);
                }
            }
            System.out.println("Минимальное: " + min);

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > max) {
                    max = numbers.get(i);
                }
            }
            System.out.println("Максимальное: " + max);

            int res = 0;
            for (int i : numbers) {
                res += i;
                mid = res / numbers.size();
            }
            System.out.println("Среднее арифметическое: " + mid);
        }
    }
}

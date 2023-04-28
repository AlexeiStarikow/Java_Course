// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class dz_2 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                numbers.add(x);
            }
            System.out.println(numbers);

            for (int i =numbers.size()-1; i >=0; i--) {
                int even = numbers.get(i) % 2;
                if (even == 0) {
                    numbers.remove(i);
                }
            }
            Collections.sort(numbers);
            System.out.println(numbers);
        }
    }
}

// Вывести все простые числа от 1 до 1000

package Lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dz_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean simplnum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simplnum = false;
                    break;
                }
            }
            if (simplnum) {
                System.out.println(i);
            }
        }
    }
}

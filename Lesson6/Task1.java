// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив, 
// и с помощью Set вычислите процент уникальных значений в данном массиве, 
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int[] arr=createArr();

        System.out.println(Arrays.toString(arr));
        System.out.println(percentUniq(arr)); 
    }
    // 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
    public static int [] createArr() {
        int[] arr=new int[1000];
        Random random=new Random();

        for(int i =0 ;i<1000;i++){
            arr[i]=random.nextInt(25);
        }
        return arr;  
    }
    // 2. Создайте метод, в который передайте заполненный выше массив...
    public static float percentUniq(int[] array) {
        Set<Integer> uniq=new HashSet<>();
        for (int i : array) {
            uniq.add(i);
        }
        float res=(float)uniq.size()*100/array.length;
        return res;
    }
}

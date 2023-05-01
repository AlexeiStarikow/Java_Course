// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package Lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers.add(i, random.nextInt(100));
        }
        System.out.println(numbers);
        System.out.println(reverseArr(numbers));
        scanner.close();

    }

    // Метод возвращает перевернутый список
    public static List<Integer> reverseArr(List<Integer> arr) {
        List<Integer> resArr = new LinkedList<>();
        int index = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            resArr.add(i, arr.get(index));
            index--;
        }
        return resArr;
    }
}

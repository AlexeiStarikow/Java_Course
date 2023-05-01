// сравнить array и linked по скорости 

package Lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task0 {
    public static void main(String[] args) {
        int SIZE = 10_000_000;

        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long finish = System.nanoTime();
        System.out.printf("ArrayList: %f\n", (finish - start) / 1e+9);

        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        finish = System.nanoTime();
        System.out.printf("LinkedList: %f\n", (finish - start) / 1e+9);
    }
    
}



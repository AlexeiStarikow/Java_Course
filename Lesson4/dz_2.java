// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Lesson4;

import java.util.LinkedList;
import java.util.Random;

public class dz_2 {
    public static void main(String[] args) {
        LinkedList<Integer> resList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            enqueue(resList, random.nextInt(100));
        }
        System.out.println(resList);

        System.out.println(dequeue(resList));
        System.out.println(resList);

        System.out.println(first(resList));
        System.out.println(resList);

        boolean em = isEmpty(resList);
        System.out.println(em);

    }

    // помещает элемент в конец очереди
    public static void enqueue(LinkedList<Integer> resList, int num) {
        resList.addLast(num);
    }

    // возвращает первый элемент из очереди и удаляет его
    public static int dequeue(LinkedList<Integer> resList) {
        int num=resList.get(0);
        resList.remove(0);
        return num;
    }

    // возвращает первый элемент из очереди, не удаляя
    public static int first(LinkedList<Integer> resList) {
        return resList.getFirst();
    }

    // возвращает размер очереди
    public static void size(LinkedList<Integer> resList) {
        resList.size();
    }

    // если очередь пустая, возвращает true
    public static boolean isEmpty(LinkedList<Integer> resList) {
        boolean res = true;
        if (resList.size() > 0) {
            res = false;
        }
        return res;
    }
}

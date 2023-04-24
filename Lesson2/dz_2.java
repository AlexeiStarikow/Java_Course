// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.

package Lesson2;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class dz_2 {
    public static void main(String[] args) {
        Logger LOG=Logger.getLogger(dz_2.class.getName());
        LOG.setLevel(Level.INFO);
        ConsoleHandler ch =new ConsoleHandler();
        LOG.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);
        int[] arr = { 4, 1, 15, 12, 44, 79, 10, 5, 90, 2 };
        LOG.info("Создали массив");
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    private static void bubbleSort(int [] arr){
        Logger LOG=Logger.getLogger(dz_2.class.getName());
        LOG.setLevel(Level.INFO);
        ConsoleHandler ch =new ConsoleHandler();
        LOG.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);
        for (int i = 0; i< arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    LOG.info("Поменяли местами числа");
                }
            }
        }
    }
}

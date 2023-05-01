// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида 
// text~num
// Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.InputMap;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "866");
        List<String> inputList = new LinkedList<>();
        String[] tempArr = new String[2];
        while (true) {
            System.out.println("Введите строку вида text~num: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            if (input.contains("~")) {
                tempArr = input.split("~");
                int num = Integer.parseInt(tempArr[1]);
                if (tempArr[0].equals("print")) {
                    if (num >= 0 && num < inputList.size()) {
                        System.out.println(inputList.get(num));
                        inputList.remove(num);
                        System.out.println(inputList);
                    }
                    else{
                        System.out.println("Ошибка, индекс выходит за диапазон");
                    }
                } else {
                    if (num > inputList.size()) {
                        System.out.println("Введен слишком большой индекс, будте добавлен в конец списка");
                        num = inputList.size();
                    }
                    if (num < 0) {
                        System.out.println("Введен отрицательный индекс, будте добавлен в начало списка");
                        num = 0;
                    }
                    inputList.add(num, tempArr[0]);
                    System.out.println(inputList);
                } 
            }
            else{
                System.out.println("Ошибка");   
            }

        }
        scanner.close();

    }
}
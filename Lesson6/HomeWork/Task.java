// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HomeWork;

import java.util.HashSet;
import java.util.Set;


public class Task {
    public static void main(String[] args) {
        Laptops Laptop = new Laptops("toshub", "n52", "black", 120, 8, "win", 100);
        Laptops Laptop2 = new Laptops("ph", "n882", "white", 333, 3, "win", 120);
        Laptops Laptop3 = new Laptops("lonovo", "12342", "black", 512, 12, "null", 200);
        Laptops Laptop4 = new Laptops("bell", "m2", "gray", 1000, 12, "win", 250);

        // создаем множество
        Set<Laptops> LaptopsSet = new HashSet<>();
        LaptopsSet.add(Laptop);
        LaptopsSet.add(Laptop2);
        LaptopsSet.add(Laptop3);
        LaptopsSet.add(Laptop4);

        // Фильтрация по всем категориям
        // Set<Laptops> res=Laptops.filter(LaptopsSet);
        // System.out.println("По вашему запросу найдено: \n" + res);


        // Фильтрация по выбраным категориям
        Set<Laptops> resLaptops=Laptops.filterChoice(LaptopsSet);
        System.out.println("По вашему запросу найдено: \n" + resLaptops.toString());

    }

    
}

package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Массив котов
        Cat cat = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Murzik", 7);
        Cat cat3 = new Cat("Vasuya", 11);
        Cat cat4 = new Cat("Basuya", 4);
        Cat cat5 = new Cat("Tom", 18);
        
        List<Cat> cats=new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        System.out.println(cats);
        // Тарелка для всех
        Plate plate = new Plate(100);

        plate.info();

        plate.foodForAll(cats);

        plate.info();
        
        System.out.println(cats);

        plate.addFood(20);

        plate.info();

    }
}

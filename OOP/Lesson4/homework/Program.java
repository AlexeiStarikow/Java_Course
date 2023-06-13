
public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Apple> appleBox=new Box<>();
        Box<Orange> orangeBox=new Box<>();
        Box<Apple> appleBox2=new Box<>();
        Box<Orange> orangeBox2=new Box<>();

        // Проверяем метод добавления фруктов в коробку
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        orangeBox2.addFruit(new Orange());

        // Проверяем метод compare
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox.compare(appleBox2));

        // Проверяем метод getBoxWeight
        System.out.println(appleBox.getBoxWeight());
        System.out.println(orangeBox2.getBoxWeight());

        // Проверяем метод pour
        System.out.println(appleBox);
        System.out.println(appleBox2);

        System.out.println(orangeBox);
        System.out.println(orangeBox2);

        appleBox.pour(appleBox2);
        orangeBox.pour(orangeBox2);

        System.out.println(appleBox);
        System.out.println(appleBox2);
        
        System.out.println(orangeBox);
        System.out.println(orangeBox2);
        
    }

}

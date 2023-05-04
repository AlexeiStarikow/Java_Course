// Пусть дан список сотрудников
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.
package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class dz_2 {

    public static void main(String[] args) {
        String[] people = new String[] {"Иван Иванов", "Иван Петров", "Сергей Козлов", "Евгений Петров", "Сергей Васильев", "Иван Смирнов", "Андрей Петров",
                                        "Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Иван Ежов","Анна Владимирова"};
        ArrayList<String> peopleName = getName(people);
        Map<String, Integer> mapName =  getMap(peopleName);
        System.out.println("Повторяющиеся имена: ");
        nameRepeat(mapName);
        System.out.println("Отсортированные по убыванию популярности: ");
        sortName(mapName);
    }

    // Метод отбирает только имена
    public static ArrayList<String> getName(String [] list){
        ArrayList<String> listName = new ArrayList<>();
        for (String el : list) {
            String [] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }

    // Метод считает повторения имен
    public static Map<String,Integer> getMap (ArrayList<String> arList) {
        Map<String,Integer> names=new HashMap<>();
        for (int i = 0; i < arList.size(); i++) {
            int count=1;
            for (int j= i+1; j < arList.size(); j++) {
                if (arList.get(i).equals(arList.get(j))) count += 1;
            }
            if (names.containsKey(arList.get(i)) == false){
                names.put(arList.get(i), count);
            } 
        }
        return names;
    }

    // Метод выводит имена и количество повторений
    public static void nameRepeat(Map<String, Integer> map){
        for(var item: map.entrySet()){
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }
    // Метод сортирует по убыванию популярности
    public static void sortName(Map<String, Integer> map){
        // Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        for(var item: map.entrySet()) {
            if (listCount.contains(item.getValue()) == false){
                listCount.add(item.getValue());
            }
        }
        listCount.sort(null);
        for (int i = listCount.size()-1; i > -1; i--){
            for (var item: map.entrySet()){
                if (listCount.get(i) == item.getValue()) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }
}

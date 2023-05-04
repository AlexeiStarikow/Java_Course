// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dz_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneDir = new HashMap<>();
        addNumber("Ivanov", "123", phoneDir);
        addNumber("Ivanov", "1234", phoneDir);
        addNumber("Petrov", "546585", phoneDir);
        addNumber("Sidorov", "8956477", phoneDir);
        addNumber("Ivanov", "12356233", phoneDir);
        addNumber("Petrov", "787897", phoneDir);
        addNumber("Petrov", "5", phoneDir);

        printBook(phoneDir);

    }

    // Метод добавляет контакт
    public static void addNumber(String key, String value, Map<String, List<String>> map) {
        if(map.containsKey(key)){
            map.get(key).add(value);
        }
        
        else{
            ArrayList<String> list= new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
 
    // Метод распечатывает справочник
    public static void printBook(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}

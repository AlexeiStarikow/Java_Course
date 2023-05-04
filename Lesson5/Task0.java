// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.


package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task0 {
    public static void main(String[] args) {
        Map <Integer,String> passportToLastname= new HashMap<>();
        passportToLastname.put(123456, "Иванов");
        passportToLastname.put(321456, "Васильев");
        passportToLastname.put(234561, "Петрова");
        passportToLastname.put(234432, "Иванов");
        passportToLastname.put(654321, "Петрова");
        passportToLastname.put(345678, "Иванов");

        System.out.println(passportToLastname);

        for(Map.Entry<Integer,String> pair : passportToLastname.entrySet()){
            if(pair.getValue().equals("Иванов")){
                System.out.println(pair);
            }
        }
    }
}

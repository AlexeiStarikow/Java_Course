// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package Lesson1;

import java.nio.charset.Charset;
import java.time.LocalTime;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        LocalTime mytime = LocalTime.now();
        if (mytime.getHour() >= 5 && mytime.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        else if (mytime.getHour() >= 12 && mytime.getHour() < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        else if (mytime.getHour() >= 18 && mytime.getHour() < 22) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (mytime.getHour() >= 22 ){
            System.out.printf("Доброй ночи, %s!", name);
        }
        
        System.out.println(mytime.getHour());
        iScanner.close();
    }
}

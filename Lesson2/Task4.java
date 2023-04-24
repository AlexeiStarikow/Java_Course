// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//  который запишет эту строку в простой текстовый файл, обработайте исключения.


package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String text="TEST";
        int repeat=100;
        String result=strRepeat(text, repeat);
        System.out.println(result);
        writeToFile(text);
    }
    public static String strRepeat(String word, int count){
       return word.repeat(count);
    }
    
    private static void writeToFile(String text){
        try (FileWriter writer = new FileWriter ("TEST.txt")) {
            writer.append (text);
        }
        catch (IOException ex) {
            System.out.println ("Error: " + ex.getMessage ());
        }
    }
}

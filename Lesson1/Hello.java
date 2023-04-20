package Lesson1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {    
    public static void main(String[] args) {
        System.out.println("Hello");

        LocalDateTime now =LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println(now);
        System.out.println(formatter.format(now));
    }
}

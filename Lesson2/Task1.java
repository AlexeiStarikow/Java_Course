// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.


package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int n=10;
        char c1 = 'a';
        char c2 = 'z';
        
        System.out.println(showStr(n, c1, c2));

    }

    private static String showStr(int count, char c1, char c2){
        StringBuilder str= new StringBuilder();
        for(int i=0;i<count;i++){
            if(i%2==0) str.append(c1);
            else str.append(c2);
        }
        return str.toString();
    }
}

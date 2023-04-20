package Lesson1;
import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.


public class Task2 {
    public static void main(String[] args) {
        int [] arr=new int[] {1,1,0,1,1,1};
        int count=0;
        int maxcount=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==1){
                count++;
                if(maxcount<count){
                    maxcount=count;
                }
            }
            else {
                count=0;
            }

        }
        System.out.printf("Максимальное количество: %d\n", maxcount);
    }
    
}

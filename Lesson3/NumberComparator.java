package Lesson3;

import java.util.Comparator;

public class NumberComparator implements Comparator <Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
        if (o1<o2) return -1;
        else if(o1==02) return 0;
        else return 1;
    }
}

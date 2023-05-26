import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>(List.of(5,600,3,2,4,5,8,3));
        System.out.println(hashSet);

        Set<Integer> linkedhashSet=new LinkedHashSet<>(List.of(5,600,3,2,4,5,8,3));
        System.out.println(linkedhashSet);

        Set<Integer> treeSet=new TreeSet<>(List.of(5,600,3,2,4,5,8,3));
        System.out.println(treeSet);
    }
}
 
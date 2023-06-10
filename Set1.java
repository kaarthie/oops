package Set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> l=new HashSet<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
    }
}

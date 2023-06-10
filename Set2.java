package Set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        //remove duplicates in arr
        Set<String> l=new HashSet<>();
        String a[]=new String[]{"Hari","Hari","Mohan","Karthi","Karthi"};
        for(String sh:a)l.add(sh);
        System.out.println(l);
    }
}

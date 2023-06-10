package Queue;
import java.util.*;
class Queue_StringRev{
    public static void main(String[] args) {
        Queue<Character> l=new LinkedList<>();
        String s="karthi";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            l.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            res+=l.remove();
        }
        System.out.println(res);
    }
}
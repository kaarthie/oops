package Queue;

public class Generics_Methods2 {
    public static void main(String[] args) {
        Double[] a=new Double[]{5.5,6.7,8.9};
        Object[] b=new Object[]{3333,"String",44.56};
    }
    public static <T> void funRev(T[] s){
        for(int i=s.length-1;i>=0;i--){
            System.out.println(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

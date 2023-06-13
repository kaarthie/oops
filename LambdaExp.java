package generics;

import jdk.dynalink.Operation;

public class LambdaExp {
    public static void main(String[] args) {
        Operator sum=(a,b) -> a+b;
        Operator prod=(a,b)-> a*b;
        Operator sub=(a,b)-> a-b;
        int c=4;
        int d=9;
        System.out.println(sum.op(c,d));
        System.out.println(prod.op(c,d));
        System.out.println(sub.op(c,d));
    }
}
interface Operator{
    int op(int a,int b);
}

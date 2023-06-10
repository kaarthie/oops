package generics;

public class Generics2<T extends Number> {
    private T a;
    public Generics2(T value){
        this.a=value;
    }

    @Override
    public String toString() {
        return "a=" + a ;
    }

    public static void main(String[] args) {
        Generics2<Integer> l1=new Generics2<>(909);
        Generics2<Double> l2=new Generics2<>(909.99);
//        Generics2<String> l3=new Generics2<>("Karhti");
        System.out.println(l1);
        System.out.println(l2);
    }
}

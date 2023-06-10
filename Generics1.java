package generics;

public class Generics1<T> {
    private T a;
    public Generics1(T a){
        this.a=a;
    }
    public void getValue(){
        System.out.println(a);
    }
    public void putValue(T s){
        a=s;
    }
    public String toString(){
        return a.toString();
    }

    public static void main(String[] args) {
        Generics1<String> l=new Generics1<>("Karthi");
        Generics1<Integer> n=new Generics1<>(1231);
        l.putValue("Ravi");
        System.out.println(n.toString());
        System.out.println(l);
    }
}

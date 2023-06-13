package generics;

public class Generics3 <T>{
    private T a;
    public Generics3(T value) {
        this.a=value;
    }
    public void display(){
        System.out.println(a.toString());
    }

    public static void main(String[] args) {
        Generics3<? extends Number> obj=new Generics3<>(17.89);
    }
}

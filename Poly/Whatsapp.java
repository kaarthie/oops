package Poly;
//overloading and overriding
public class Whatsapp extends Message {
    void msg(String name,int n){
        System.out.println("I am "+name+" and I am "+n+" years old");
    }
    void msg(){
        System.out.println("I am from children class");
    }

    public static void main(String[] args) {
        Whatsapp a=new Whatsapp();
        Message b=new Message();
        b.msg();
        a.msg();
        a.msg("Ram",18);
        System.out.println(calculate(5,6));
        System.out.println(calculate(5,6,7));

    }
    static int  calculate(int a,int b){
        return a+b;
    }
    static int calculate(int a,int b,int c){
        return a*b*c;
    }
}

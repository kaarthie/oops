package pck1;

public class Human {
    String name;
    int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Kar extends Human {
    int id;
    public Kar(String name,int age,int id) {
        super(name, age);
        this.id=id;
    }
    public static void main(String[] args) {
//        Human a=new Human("Karthi",21);
//        Kar b=new Kar("Ravi",50,2);
//        Human c=new Kar("Sabari",22,2);
//        System.out.println(c.age);
//        System.out.println(b.id);
        Kar a[]=new Kar[3];
    }
}

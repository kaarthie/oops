package Inheritance;

public class Parent {
    String country="India";
    String name;
    int age;
    public Parent(String name,int age) {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name);;
        System.out.println(age);
    }
}
public class Kid extends Parent {
    int year;
    String country;
    public Kid(String name, int age,int year,String country) {
        super(name, age);
        this.year=year;
        this.country=country;
    }
    @Override
    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(year);
        System.out.println(country);
    }

    public static void main(String[] args) {
        Parent j=new Parent("ravi",50);
        Kid k=new Kid("karthi",12,2001,"Sri Lanka");
        Parent mom=new Kid("Bharathi",40,1980,"SriLanka");
        System.out.println(mom.country);
        //displays the ref var data and not the obj data
    }
}


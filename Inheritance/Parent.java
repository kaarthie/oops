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


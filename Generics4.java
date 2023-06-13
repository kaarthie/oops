package generics;

import java.util.Arrays;

public class Generics4 <T>{
    Object[] a;
    static final int cap=10;
    static int size;
    public Generics4(){
        this.a=new Object[cap];
        this.size=0;
    }
    public void add(T data){
        if(isFull()){
            resize();
        }
        a[size++]=data;
    }
    void remove() {
        size--;
    }
    int getSize(){
        return size+1;
    }
    int indexOf(T data){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==data)return i;
        }
        return -1;
    }
    boolean isFull(){
        return size==cap;
    }
    void resize(){
        Object temp[]=new Object[a.length*2];
        for (int i = 0; i < a.length; i++) {
            temp[i]=a[i];
        }
        a=temp;
    }
    public String toString(){
        Object temp[]=new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i]=a[i];
        }
        return Arrays.toString(temp);
    }
    boolean isEmpty(){
        return size==0;
    }
}
class Sub extends Generics4{
    String woking="ArrayList";
}
class Main{
    public static void main(String[] args) {
        Generics4<String> name =new Generics4<>();
        Generics4<Integer> age =new Generics4<>();
        Generics4<Character> grade=new Generics4<>();
        for (int i = 0; i < 5; i++) {
            name.add("Karthi");
            age.add(21);
            grade.add('B');
        }
        System.out.println(name+" "+age+" "+grade);
    }
}

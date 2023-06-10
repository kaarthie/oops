package generics;
import java.util.*;
public class Stack_Valid_Paranthesis<T> {
    private Object a[];
    private int top;
    private static int cap = 10;

    public Stack_Valid_Paranthesis() {
        a = new Object[cap];
        top = -1;
    }
    private void resize(){
        Object t[]=new Object[a.length*2];
        for (int i = 0; i < top; i++) {
            t[i]=a[i];
        }
        a=t;
    }

    public void push(T value) {
        if (isFull()) {
            resize();
        }
        a[++top] = value;
    }

    public char pop() {
        return (char)a[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == a.length;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        System.out.println(fun(a));
    }
    public static boolean fun(String a){
        Stack_Valid_Paranthesis <Character> s=new Stack_Valid_Paranthesis<>();
        Scanner in=new Scanner(System.in);
        for(char c:a.toCharArray()){
            if(c=='{')s.push('}');
            else if(c=='[')s.push(']');
            else if(c=='(')s.push(')');
            else if(s.isEmpty() || s.pop()!=c)return false;
        }
        return s.isEmpty();
    }
}

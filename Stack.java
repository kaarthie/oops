package generics;

public class Stack<T> {
    private Object a[];
    private int top;
    private static int cap=10;

    public Stack() {
        a = new Object[cap];
        top=-1;
    }
    public void push(T value){
        if(isFull()){
            resize();
        }
        a[++top]=value;
    }
    public void pop(){
        if(isEmpty()) System.out.println("Stack is empty");
        else System.out.println(a[top--]);
    }
    public boolean isEmpty(){
        return top==-1;
    }
    private boolean isFull(){
        return top==a.length;
    }
    private void resize(){
        Object t[]=new Object[a.length*2];
        for (int i = 0; i < top; i++) {
            t[i]=a[i];
        }
        a=t;
    }

    public static void main(String[] args) {
        Stack<Integer> l=new Stack<>();
        System.out.println(l.isEmpty());
        for (int i = 0; i < 5; i++) {
            l.push(i+1);
        }
        l.pop();
        System.out.println(l.isEmpty());
    }

}

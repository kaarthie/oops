package generics;

import java.util.*;
class Stack_DeleteTop{
    int t=-1;
    int a[];
    int s;
    Stack_DeleteTop(int n){
        t=-1;
        a=new int[n];
        s=n;
    }
    void push(int x){
        t++;
        a[t]=x;
    }
    void pop(){
        System.out.println("Deleted element is "+a[t]);
        t--;
    }
    void peek(){
        for(int i=t;t>=0;t--)System.out.println(a[t]);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack_DeleteTop st=new Stack_DeleteTop(n);
        for(int i=0;i<n;i++){
            st.push(in.nextInt());
        }
        st.pop();
        System.out.println("The elements in stack");
        st.peek();

    }
}

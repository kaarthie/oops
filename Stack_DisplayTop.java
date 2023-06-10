package generics;
import java.util.*;
class Stack_DisplayTop{
    int t=-1;
    int a[];
    int s;
    Stack_DisplayTop(int n){
        a=new int[n];
        s=n;
    }
    void push(int x){
        a[++t]=x;
    }
    void pop(){
        System.out.print(a[t]);
    }
    public static void main(String arga[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack_DisplayTop st=new Stack_DisplayTop(n);
        for(int i=0;i<n;i++){
            st.push(in.nextInt());
        }
        st.pop();
    }
}
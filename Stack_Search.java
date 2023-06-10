package generics;
import java.util.*;
class Stack_Search{
    int t=-1;
    int a[];
    int s;
    Stack_Search (int n){
        a=new int[n];
        s=n;
    }
    void push(int n){
        a[++t]=n;
    }
    void search(int e){
        int f=0;
        for(int i=0;i<s;i++){
            if(a[i]==e){
                f=1;
                break;
            }
        }
        if(f==1)System.out.print("Element found");
        else System.out.print("Element not found");
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack_Search st=new Stack_Search(n);
        for(int i=0;i<n;i++){
            st.push(in.nextInt());
        }
        int e=in.nextInt();
        st.search(e);
    }
}
package generics;

import java.util.*;
class Stack_Palindrome{
    int t=-1;
    int s;
    char x;
    char a[];
    Stack_Palindrome(int n){
        a=new char[n];
        s=n;
    }
    void push(char c){
        t++;
        a[t]=c;
    }
    char pop(){
        x = a[t];
        t--;
        return x;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        Stack_Palindrome st=new Stack_Palindrome(s.length());
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        int c=0,f=1;
        while(c>=0){
            if (st.pop()!=s.charAt(c)){
                f=1;
                break;
            }
            c--;
        }
        if(f==0)
            System.out.println(s+" is palindrome");
        else System.out.print(s+" is not a palindrome");
    }
}
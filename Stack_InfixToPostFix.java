package generics;
import java.util.*;
public class Stack_InfixToPostFix{
    int t;
    int s;
    char stack[];
    public Stack_InfixToPostFix(int n){
        stack=new char[n];
        s=n;
    }

    void push(char c){
        t++;
        stack[t]=c;
    }

    char pop(){
        char c=stack[t];
        t--;
        return c;
    }

    char peek(){
        return stack[t];
    }

    boolean empty(){
        if(t==-1)return true;
        return false;
    }
    int precedence(char c){
        if(c=='^')return 3;
        if(c=='*'||c=='/')return 2;
        if(c=='+'||c=='-')return 1;
        return 0;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        int n=str.length();
        String res="";
        Stack_InfixToPostFix st=new Stack_InfixToPostFix(n);
        for(int i=0;i<n;i++){
            if(Character.isLetter(ch[i])){
                res+=ch[i];
            }
            else if(ch[i]=='('){
                st.push(ch[i]);
            }
            else if(ch[i]==')'){
                while(st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else{
                if(st.empty()){
                    st.push(ch[i]);
                }
                else if(st.precedence(st.peek())<st.precedence(ch[i])){
                    st.push(ch[i]);
                }
                else{
                    while(!st.empty() && st.precedence(st.peek())>=st.precedence(ch[i])){
                        res+=st.pop();
                    }
                    st.push(ch[i]);
                }
            }
        }
        while(!st.empty()){
            res+=st.pop();
        }
        System.out.print(res.substring(0,res.length()-1));
    }
}
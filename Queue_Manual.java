package Queue;

import java.util.*;
class Queue_Manual{
    int front = -1;
    int rear = -1;
    int[] a;
    int s;
    Queue_Manual(int n){
        a=new int[n];
        s = n;
    }
    void add(int n){
        if(front == -1){
            front++;
            a[front]=n;
            rear++;
        }
        else {
            rear++;
            a[rear]=n;
        }
    }
    void display(){
        System.out.println("Queue is : ");
        for(int i=front ;i<=rear ;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0){
            Queue_Manual st=new Queue_Manual(n);
            for(int i=0;i<n;i++){
                st.add(in.nextInt());
            }
            st.display();
        }
        else System.out.print("Queue is empty");
    }
}
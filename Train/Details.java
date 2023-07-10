package Train;

import java.util.ArrayList;
import java.util.List;

public class Details {
    static int id;
    static List<User> res=new ArrayList<>();
    static List<User> wl=new ArrayList<>();
    public static void addRes(User user){
        if(res.size()==1){
            putInWL(user);
        }
        else {
            id++;
            res.add(user);
            System.out.println(user.toString()+ " Booked");
        }
    }
    public static void cancel(int id) {
        if (res.size() == 0) System.out.println("No tickets booked in the given id");
        else {
            res.remove(id - 1);
            res.add(wl.get(1));
            wl.remove(1);
            System.out.println("Ticket Cancelled Successfully");
        }
    }

    private static void putInWL(User user) {
        if (wl.size() == 1) {
            System.out.println("Tickets full");
        } else {
           // System.out.println("You are put in waiting list");
            System.out.println(user.toString()+" You are put in waiting list");
            wl.add(user);
        }
    }

    public static void display(){
        System.out.println("Reserved tickets : ");
        for(int i=0;i<res.size();i++){
            System.out.println(i+1+" "+res.get(i).toString());
        }
        System.out.println("Waiting list Tickets : ");
        for (int i = 0; i < wl.size(); i++) {
            System.out.println(i+1+" "+wl.get(i).toString());
        }
        System.out.println();
    }


    public static void avt() {
        System.out.println("Available Tickets :\nReserved : "+(1- res.size())+"\nWL : "+(1-wl.size()));
    }
}

package Train;

import java.util.ArrayList;
import java.util.List;

public class Details {
    static int id;
    static List<User> res=new ArrayList<>();
    static List<User> wl=new ArrayList<>();
    public static void addRes(User user){
        if(res.size()==3){
            putInWL(user);
            id++;
        }
        else {
            id++;
            res.add(user);
            System.out.println("\n"+user.toString()+ " --->  Successfully Booked\n");
        }
    }
    public static void cancel(int id) {
        if (res.size() == 0) System.out.println("\nPlease Enter Valid ID\n");
        else {
            if(id<res.size()){
                res.remove(id - 1);
                System.out.println("Ticket Cancelled Successfully");
            }
            if(wl.size()>0) {
                res.add(wl.get(0));
                wl.remove(0);
            }
        }
    }

    private static void putInWL(User user) {
        if (wl.size() == 3) {
            System.out.println("\n### TICKETS FULL ###\n");
        } else {
           // System.out.println("You are put in waiting list");
            System.out.println("\n"+user.toString()+"--> Put in waiting list\n");
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
        System.out.println("Available Tickets : \nReserved --> "+(3- res.size())+"\nWaitingList --> "+(3-wl.size())+"\n");
    }
}

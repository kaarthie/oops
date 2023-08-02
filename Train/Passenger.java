package Train;

import java.util.*;

public class Passenger {

    public static void main(String[] args) {
        System.out.println("************TRAIN TICKET BOOKING************");
        Scanner in=  new Scanner(System.in);
        boolean con = true ;
        int n;
        while(con){
            System.out.println("1. Book\n2. Print Booked tickets\n3. Available Tickets\n4. Cancel \n");
            n=in.nextInt();
            switch(n){
                case 1:{
                    System.out.print("Enter Name : ");
                    String name=in.next();
                    System.out.print("Enter Age : ");
                    int age=in.nextInt();
                    in.nextLine();
                    System.out.print("Enter berth : ");
                    char c=in.next().charAt(0);
                    User user=new User(name,age,c);
                    Details.addRes(user);
                    break;
                }
                case 2:{
                    Details.display();
                    break;
                }
                case 3:{
                    Details.avt();
                    break;
                }
                case 4:{
                    System.out.println("Enter id to Cancel : ");
                    Details.cancel(in.nextInt());
                    break;
                }
            }
        }

    }
}

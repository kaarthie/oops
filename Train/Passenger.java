package Train;

import java.util.*;

public class Passenger {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        boolean con = true ;
        int n;
        while(con){
            System.out.println("1. Book\n2. Print Booked tickets\n3. Available Tickets\n4. Cancel ");
            n=in.nextInt();
            switch(n){
                case 1:{
                    System.out.println("Enter Details : ");
                    String name=in.next();
                    int age=in.nextInt();
                    in.nextLine();
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
                    con=false;
                    break;
                }
            }
        }

    }
}

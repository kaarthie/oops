import java.sql.SQLOutput;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a=5;
        for(int i=a;i>=0;i--){
            try{
                System.out.println(a/i);
            }
            catch(ArithmeticException e){
                System.out.println(i+" cannot be a divisor");
            }
        }
    }
}

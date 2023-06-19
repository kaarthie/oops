public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            throw new Exception("custom exception");
        }
        catch(Exception e){
            System.out.println("From custom catch");
        }
    }
}

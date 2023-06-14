public class ExceptionHandling1 {
    public static void main(String[] args) {
        int a[]=new int[2];
        a[1]=2;
        a[0]=1;
        try {
            System.out.println(a[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter correct number");
        }
    }
}

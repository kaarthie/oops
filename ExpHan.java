public class ExpHan {
    public static void main(String[] args) {
        Exception e1 = new Exception("   yeahhhhhh   ");
        try{
            throw new Exception(String.valueOf(200));
        }
        catch (ArithmeticException e){
            System.out.println("My own exception");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Enter proper index");
        }
        catch (Exception e){
            System.out.println("I have skipped the above blocks as I am not an exception of those kind");
        }
        finally{
            System.out.println("FINALLY - I am always there");
        }
    }
}

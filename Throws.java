public class Throws {
    public static void main(String[] args) {
        try{
            fun(8,0);
        }
        catch(Exception e){
            System.out.println("found an exception");
        }
    }
    static void fun(int a, int b) throws Exception{
        throw new Exception("heyy");
    }
}

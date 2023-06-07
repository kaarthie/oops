package Encap;

public class Fetcher extends Data {
    public static void main(String[] args) {
        Fetcher obj=new Fetcher();
        System.out.println(obj.name);
        System.out.println(obj.getAge()); // fetching using public methods
    }
}

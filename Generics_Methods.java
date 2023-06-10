package Queue;

public class Generics_Methods {
    public static void main(String[] args) {
        String a[]=new String[]{"abxc","xvqy","rahul"};
        Integer[] b =new Integer[]{1,2,3,4};
        fun(b);
        fun(a);

    }
    public static <T> void fun(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package Interface;

interface Naruto {
    String favChar1(String a,String b);
}
interface Vikings{
    String favChar2(String a,String b);
}
class Choice implements Naruto,Vikings{
    @Override
    public String favChar1(String a, String b) {
        if(a.equals("Naruto")||b.equals("Naruto"))return "Naruto";
        return a+" "+b;
    }

    @Override
    public String favChar2(String a, String b) {
        if(a.equals("Ragnar")||b.equals("Ragnar"))return "Ragnar";
        return a+" "+b;
    }

    public static void main(String[] args) {
        Choice p1=new Choice();
        System.out.println(p1.favChar1("Jiraya","Tsunade"));
        System.out.println(p1.favChar2("Lagertha","Bjorn"));
        System.out.println(p1.favChar1("Naruto","Sasuke"));
        System.out.println(p1.favChar2("Ragnar","Ivar"));

    }
}

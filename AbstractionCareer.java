abstract class AbstractionCareer {
    public abstract void career();
    public abstract void year(int y);
}
class Son extends AbstractionCareer{
    @Override
    public void career() {
        System.out.println("I'd like to be a movie director");
    }

    @Override
    public void year(int y) {
        System.out.println("I will achieve my dream before "+y);
    }
}
class Daughter extends AbstractionCareer{
    @Override
    public void career() {
        System.out.println("I'd like to be a singer");
    }

    @Override
    public void year(int y) {
        System.out.println("I will achieve my dream before " + y);
    }
}
class Main{
    public static void main(String[] args) {
        Son ram=new Son();
        Daughter dia=new Daughter();
        ram.career();
        ram.year(2027);
        dia.career();
        dia.year(2026);
    }
}

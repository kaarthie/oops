abstract class AbstractionShape {
    public abstract void getArea();
}
class Square extends AbstractionShape{
    int s;

    public Square(int s) {
        this.s = s;
    }
    @Override
    public void getArea(){
        System.out.println(s*s);
    }
}
class Rectangle extends AbstractionShape{
    int l,b;
    public Rectangle(int l,int b) {
        this.l=l;
        this.b=b;
    }

    @Override
    public void getArea() {
        System.out.println(l*b);
    }

    public static void main(String[] args) {
        Square s=new Square(4);
        Rectangle r=new Rectangle(9,10);
        s.getArea();
        r.getArea();
    }
}

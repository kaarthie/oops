public abstract class AbstractionCalci {
    public abstract int calculate(int a,int b);
}
class Add extends AbstractionCalci{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
class Sub extends AbstractionCalci{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
class Mul extends AbstractionCalci{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}
class Div extends AbstractionCalci{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
class Main2{
    public static void main(String[] args) {
        Add a=new Add();
        Sub b=new Sub();
        Mul c=new Mul();
        Div d=new Div();
        System.out.println(a.calculate(10,10));
        System.out.println(b.calculate(10,5));
        System.out.println(c.calculate(5,5));
        System.out.println(d.calculate(49,7));
    }
}


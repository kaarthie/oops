package Interface;

interface Shape {
    double calArea();
}
class Circle implements Shape{
    private double r;
    public Circle(double rad){
        this.r=rad;
    }

    @Override
    public double calArea() {
        return 3.14*r*r;
    }
}
class Square implements Shape{
    private double r;

    public Square(double side) {
        this.r = side;
    }

    @Override
    public double calArea() {
        return r*r;
    }
}
class Main2{
    public static void main(String[] args) {
        Square a=new Square(6.77);
        Circle b=new Circle(8.09);
        System.out.println(a.calArea());
        System.out.println(b.calArea());
    }
}

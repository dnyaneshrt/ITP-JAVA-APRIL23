package com.itp.abstractionAndEncapsulation;
//abstract classes can have abstract as well as concreate methods
//the method with no body is called as abstract method
//upcasting
//we can never can object of abstract class
abstract class Shape
{
    abstract void area();
}
class Circle extends Shape
{

    @Override
    void area() {
        double PI=3.14;
        int radious=5;
        System.out.println("area of circle: "+(PI*radious*radious));
    }
}
class Square extends Shape
{

    @Override
    void area() {
        int sides=5;
        System.out.println("area of square: "+(sides*sides));
    }
}

class Triangle extends Shape
{

    @Override
    void area() {
        int length=5;
        int breadth=10;
        System.out.println("area of triangle :"+(1.5*length*breadth));

    }
}
public class AbstractionTest {
    public void findArea(Shape shape)
    {
        shape.area();
    }
    public static void main(String[] args) {
        AbstractionTest abstractionTest=new AbstractionTest();
        abstractionTest.findArea(new Circle());
        abstractionTest.findArea(new Triangle());
        abstractionTest.findArea(new Square());
//        Shape s=new Shape();  not allowed  (Shape' is abstract; cannot be instantiated)
//        Shape shape=new Circle();//upcasting
    }
}

package oops;

public class ConsTest {
    //constructor is special member function whose name is exactly same as a class name.
    //constructor does not have return type, not even void.
    //we no need to call constructor explicitly., the moment we create object of that class cons invokes/exceutes automatically.
    //3 types of constructors.
    //i)default constructor  ii)zero param constructor   iii)param constructor
    //cons is used to initialise instance variables at the time of object creation.
    //in a single class we can have n no.of constructors by passing different params or passing params in differnt order. we called it as contructor overloading.
    //Can we overload constructor in java??   yes

    //zero param constructor
    ConsTest()
    {
        System.out.println(" i am from constructor..");
    }
 /*   ConsTest(float num,String name)
    {
        System.out.println(" i am from constructor..");
    }
    ConsTest(String name,float num)
    {
        System.out.println(" i am from constructor..");
    }*/

    //param constructor
    ConsTest(int num)
    {
        System.out.println(" i am from param constructor.."+num);
    }
    void testMethod()
    {
        System.out.println("i am from test method");
    }
    static void testStaticMethod()
    {
        System.out.println("i am from static test method");
    }
    public static void main(String[] args) {
        ConsTest c=new ConsTest();
        ConsTest c1=new ConsTest(50);
        c.testMethod();//instance method calling..
        ConsTest.testStaticMethod();//static method calling..
    }
}

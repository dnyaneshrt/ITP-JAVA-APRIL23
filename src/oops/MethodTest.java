package oops;

public class MethodTest {

    //define a method which will say hi

    //instance method(non-static method)
    //no return type- no arg
    public void sayHi()
    {
        System.out.println("hi");
    }
    //static method
    public static void sayHello()
    {
        System.out.println("hello");
    }
//return type- param
    public static int addNumbers(int num1,int num2,String name)
    {
       System.out.println("name inside addNumbers:"+name);
       return (num1+num2);
    }

    public static int findSquare(int num)
    {
        return num*num;
    }
    public static void main(String[] args) {
        System.out.println(MethodTest.findSquare(20));

      //Classname.staticMethodName();
        MethodTest.sayHello();
        MethodTest.sayHello();
        MethodTest.sayHello();

        //Object creation(instanitiation)
        //Classname ref_name=new Classname();

        MethodTest me=new MethodTest();
        me.sayHi();

        int result= MethodTest.addNumbers(10,20,"java");
        System.out.println("addition: "+result);

        System.out.println("addition: "+ MethodTest.addNumbers(50,20,"java"));


    }
}

package oops;

public class VariableTest {
    int num=111;
    static int num1=555;
    //instance variable:declared outside any method/constructor/block
    //Local variable: declared inside any method/constructor/block
    //static variable: declared outside any method/constructor/block with static keyword

    public void displayVar()
    {
        int num=999;
        System.out.println("inside method");
      /*  VariableTest variableTest=new VariableTest();
        System.out.println(variableTest.num);//111 or 999*/
        System.out.println(this.num);
    }
    public static void main(String[] args) {
        VariableTest variableTest=new VariableTest();
        System.out.println(variableTest.num);

        System.out.println(num1);
        variableTest.displayVar();

        int num5=70;
        System.out.println(num5);

    }
}

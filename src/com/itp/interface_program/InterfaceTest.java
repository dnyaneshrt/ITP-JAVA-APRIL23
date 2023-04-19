package com.itp.interface_program;
//security..
//abstraction:  abstraction is the process of knowing essential details to be knows ad ignoring non-essential details.
//abstract class and interface is used to achieve abstraction in java.
//asbtract class will achieve partial abstraction.. interface is used to achieve fully abstraction.

//we can create an inteface by using "interface" keyword.
//we can never create an object of interface.
//interface only allows abstract methods..  upto 1.8 version
//bydefault interface abstract methods are public abstract...
//bydefault interface variables are public static final means(constant)
//interface allows static methods also from 1.8 version
//interface allows default methods also from 1.8 version  using "default" keyword
//interface allows private methods as well from java 1.9 version.
//we use "implements" keyword to establish relation-ship between Parent and Child.
/* the subclass of interface is responsible to provide implementation to all interface abstract method*/
//it just tells us what to do, it hides how it's done.

//interface allows multiple inheritance..
//below interface is functional


@FunctionalInterface
interface Bank
{
    int num=20;
void provideLoanInfo();  //abstract method
}

class SBI implements Bank {
    @Override
    public void provideLoanInfo() {
        System.out.println("SBI provides loan @10.00 ROI");
    }

}
class Axis implements Bank
{

    @Override
    public void provideLoanInfo() {
        System.out.println("Axis provides loan @11.00 ROI");
    }
}
public class InterfaceTest {
    public void applyLoan(Bank bank)
    {
        bank.provideLoanInfo();
    }
    public static void main(String[] args) {
//        Bank bank=new Bank();   'Bank' is abstract; cannot be instantiated
//        Bank bank=new Axis();   Parent p=new Child();  upcasting
        InterfaceTest interfaceTest=new InterfaceTest();
        interfaceTest.applyLoan(new Axis());
        interfaceTest.applyLoan(new SBI());
        //Annonymous inner class.
        /*inner class means defining a class inside anather class.
        * Annonymous inner class means, the inner class which does not have name.*/

        Bank bank=new Bank() {

            @Override
            public void provideLoanInfo() {
                System.out.println("PNB Bank Provides Loan @12.00 ROI");
            }
        };
        bank.provideLoanInfo();

        interfaceTest.applyLoan(new Bank() {
            @Override
            public void provideLoanInfo() {
                System.out.println("union Bank provides Loan @8.00 ROi");
            }
        });


        //lamda expression.   @FunctionalInterface: SAM.  Single Abstract Method
        Bank bank2=()-> {
                System.out.println("Kotak Bank Provides Loan @12.00 ROI");
        };
        bank2.provideLoanInfo();

        interfaceTest.applyLoan(()-> System.out.println("Citi bank provides loan @5.00 ROI"));
    }
}
////empty interface is called as Marker interface
//below interface is marker interface..
//2 Serializable and Cloneable...  Pre-defined marker interfaces in Java..
interface A
{

}

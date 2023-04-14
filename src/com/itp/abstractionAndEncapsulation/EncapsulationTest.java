package com.itp.abstractionAndEncapsulation;

//always recommend to create instance or static variables as private.
class Student
{
    private String username="itp";
    private String pass="javac";
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(username.equals("itp")&&pass.equals("java"))
        {
            if(age<0)
            {
                System.out.println("kindly enter valid age");
            }else {
                System.out.println("age is set to variable");
                this.age = age;
            }
        }else {
            System.out.println("you are not authorized to change the age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationTest {

    public static void main(String[] args) {
        Student jay=new Student();
        jay.setAge(20);
        System.out.println(jay.getAge());


    }
}

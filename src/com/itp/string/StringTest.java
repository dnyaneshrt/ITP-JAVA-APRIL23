package com.itp.string;

/*String: String is Pre-defined class in java, which acts as String Datatype.
* it is used to hold group of characters.
* 2 ways. to create String.
* 1]String string_name="hello";
* 2]String string_name=new String("hello");
*String API provides readymade methods supports to with String in java.
*
* length.
* charAt(int index)
* split("")
* + or concat(); method
* toUpperCase()
* toLowerCase()
* equals() method to compare the Strings.
* equalsIgnoreCase.
* trim();  ::is used to remove/trim the white spaces from left or right side.
* indexOf(index);
* isEmpty()
* contains(char squence)
* replace(oldchar,newChar)
*  */
public class StringTest {
    public static void main(String[] args) {
     /*   char ch1='j';
        char ch2='a';
        char ch3='v';
        char ch4='a';
        char[] ch=new char[]{'j','a','v','a'};*/

        String name="Type casting can be done both manually and automatically. Type Casting happens automatically when a value of one primitive data type is assigned to another data type. There are two types of casting: Widening Type Casting and Narrowing Type Casting.";

        System.out.println("The length of the above String is: "+name.length());

        System.out.println("the charcater at the place of index no. 0 is :"+name.charAt(0));
       /* System.out.println("the charcater at the place of index no. 4 is :"+name.charAt(4));
        System.out.println("the charcater at the place of index no. 5 is :"+name.charAt(5));

        for(int i=0;i<name.length();i++)
        {
            System.out.println(i+" : "+name.charAt(i));
        }*/
        int count=0;
        String[] words=name.split(" ");
        for(String word:words)
        {
            count++;
            System.out.println(count+" : "+word);
        }


        System.out.println("Total number of words in my String: "+count);

        String first_name="Akash";
        String last_name="ingale";
        System.out.println("full name of akash after concatenating :"+first_name+" "+last_name);
        reverseString(first_name);

        System.out.println("String in uppercase :"+name.toUpperCase());
        System.out.println("String in lowerCase :"+name.toLowerCase());

        String s1="Java";
        String s2=new String("java");

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2));// true

        String stest="Dnyaneshwar";
        System.out.println("length of above string is :"+stest.length());
        // is used to remove/trim the white spaces from left and right side.
        System.out.println("length of above \" string after using trim() is :"+stest.trim().length());

        System.out.println("index no. of given charcater is :"+stest.indexOf('h'));
        System.out.println("index no. of given charcater is :"+stest.indexOf('a'));

        System.out.println("to check your String is empty or not? :"+stest.isBlank());
        System.out.println("is Casting word avaialbe in my String: "+name.contains("casting")); //true
        System.out.println(stest.concat(" java"));
        System.out.println(stest.replace('a','*'));

    }

    private static void reverseString(String name) {
        int len=name.length();
        String rev="";

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("my String after revsering: "+rev);
    }
}

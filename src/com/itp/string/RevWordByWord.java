package com.itp.string;

public class RevWordByWord {
    public static void main(String[] args) {
        String string="Java is My favourite programming langauge.";


        System.out.println(string.substring(8));
        System.out.println(string.substring(8,22));//My fav

        String[] a=string.split("a");

        System.out.println(string);
        System.out.println(a.length-1);
        String[] words=string.split(" ");

        String rev="";
        for(String word:words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                rev=rev+word.charAt(i);
            }
            rev=rev+" ";
        }

        System.out.println(rev);


     /*   for(int i=0;i<5;i++)
        {
            System.out.println("hi");
        }
        String[] names=new String[]{"Hello","Hello","Hello","Hello","Hello"};
*//*
        for(Datatype var_name:list/array)
        {
            sout(var_name);
        }*//*

        for(String name:names)
        {
            System.out.println(name);
        }*/
        //ABCDE
        //abcde
        String s1="z";
        String s2="Z";
        System.out.println(s1.compareTo(s2));



       /* if s1 > s2, it returns positive number
        if s1 < s2, it returns negative number
        if s1 == s2, it returns 0*/
    }
}

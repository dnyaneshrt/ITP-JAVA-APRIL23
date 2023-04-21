package com.itp.string;

public class SubStringTest {
    public static void main(String[] args) {
        String[] string=new String[]{"dnyanesh.sartape18@google.com","dnyanesh.sartape18@yahoo.com","dnyanesh.sartape18@abcd.com"};
           for(String id:string) {
               getDomain(id);
           }
    }
    private static void getDomain(String id) {
        try {
            String[] words = id.split("@");
            System.out.println(words[1].substring(0, words[1].indexOf('.')));
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("please enter valid id "+e.getMessage());
        }
    }
}

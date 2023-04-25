package com.itp.exception;
//throw keyword is used to throw (custom exception) user-defined exception/ pre-defined exceptions as well.
//throw new ExceptionClassName();
public class ThrowTest {
    public static void main(String[] args) {
        int age=5;
        if(age<18) {
            try {
                throw new CannotVoteException("age must be greater than 18 to vote in india..");
            } catch (CannotVoteException e) {
                e.printStackTrace();
                System.out.println("exception arised " + e.getMessage());
            }
        }
        else {
            System.out.println("you can vote");
        }
        System.out.println("other code");
    }
}

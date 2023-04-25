package com.itp.exception;

//custom exception/user defined exception.
/*1] create a class as child of java.lang.Exception*/
public class CannotVoteException extends Exception{
    CannotVoteException(String str)
    {
        super(str);//will send this param to parent class constructor.
    }
}

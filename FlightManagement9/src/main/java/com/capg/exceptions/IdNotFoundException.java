package com.capg.exceptions;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String msg){
        super(msg);
    }

    public IdNotFoundException(String msg,Throwable f){
        super(msg,f);
    }
}

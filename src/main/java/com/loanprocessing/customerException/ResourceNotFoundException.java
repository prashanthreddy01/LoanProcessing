package com.loanprocessing.customerException;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
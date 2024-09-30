package com.employee.management.exceptionHandling;

public class NotFoundException extends RuntimeException{
    private String messgae;
    public NotFoundException(String message){
        super(String.format(message));
    }
}

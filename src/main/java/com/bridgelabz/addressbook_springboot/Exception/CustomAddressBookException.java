package com.bridgelabz.addressbook_springboot.Exception;

public class CustomAddressBookException extends RuntimeException {
    public CustomAddressBookException(String message){
        super(message);
    }

}

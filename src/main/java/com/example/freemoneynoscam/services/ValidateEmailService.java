package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }
        return false;
    }
    //Write unit test to test this method
}

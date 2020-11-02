package com.util;

public class Validation {
    // instance
     private static String regex = "^[a-zA-Z]+$";

    //Function to validate input from Player
    public static boolean isInputValidString(String input) {
        input=input.replaceAll("\\s","");
        if(input.matches(regex)){
            return true;
        }
        return false;
    }


}

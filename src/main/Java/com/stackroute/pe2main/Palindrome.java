package com.stackroute.pe2main;

public class Palindrome {
    public static boolean checkPalindrome(String input) {
        String reverseinput="";
        for(int i=input.length()-1;i>=0;i--){
            //storing characters from end in reverseinput
            reverseinput+=input.charAt(i);
        }
        boolean flag;
        //checking if reverse string and original string are equal
        if(reverseinput.equals(input))
            flag=true;
        else
            flag=false;
        return flag;
    }
}

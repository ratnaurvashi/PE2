package com.stackroute.pe2main;

public class PowerOfFour {
    public static boolean checkPowerOfFour(int number) {
        //check for 0
        if(number==0)
            return false;
        while (number!=1){
            //checking if number is power of four
            if(number%4!=0)
                return false;
            number=number/4;
        }
        return true;
    }
}

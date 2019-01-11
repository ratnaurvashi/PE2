package com.stackroute.pe2main;

public class LongFactorial {
    //finding the factorial
    public int fact(int number){
        int result=1;
        if(number>12) result=-1;
        else {
            while (number > 0) {
                result *= number;
                number--;
            }
        }
        return result;
    }
}

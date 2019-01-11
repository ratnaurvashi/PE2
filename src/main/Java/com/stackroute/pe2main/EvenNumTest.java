package com.stackroute.pe2main;

public class EvenNumTest {
    public boolean checkEven(int number) {
            boolean result;
            //checking for zero
            if(number==0)
                result= false;
            //if number is not even
            else if(number%2!=0)
                result=false;
            //if number is even
            else
                result=true;

            return result;
        }
    }


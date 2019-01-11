package com.stackroute.pe2main;

public class Computation {
    //for computing average
    public double getAvg(int total, double[] grades){
        double sum=0;
        for(int i=0;i<total;i++)
            sum+=grades[i];
        double avg=sum/total;
        return avg;
    }
    //for computing maximum
    public double getMax(int total, double[] grades){
        double max=-1;
        for(int i=0;i<total;i++)
        {
            if(max<grades[i]){ max=grades[i]; }
        }
        return max;
    }
    //for computing minimum
    public double getMin(int total, double[] grades){
        double min=101;
        for(int i=0;i<total;i++)
        {
            if(min>grades[i]){ min=grades[i]; }
        }
        return min;
    }
}

import java.util.Scanner;

public class Computation {
    public static void main(String args[]){
        int n=new Scanner(System.in).nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=new Scanner(System.in).nextInt();

        double avg=getAvg(n,a);
        double max=getMax(n,a);
        double min=getMin(n,a);

    }

    public static double getAvg(int n, int[] arr){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        double avg=sum/n;
        return avg;

    }
    public static double getMax(int n, int[] arr){
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i]){ max=arr[i]; }
        }
        return max;

    }
    public static double getMin(int n, int[] arr){
        int min=101;
        for(int i=0;i<n;i++)
        {
            if(min>arr[i]){ min=arr[i]; }
        }
        return min;

    }

    }

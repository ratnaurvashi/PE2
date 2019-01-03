import java.util.Scanner;

public class EvenNumTest {

        public static void main(String args[]){
            int n=new Scanner(System.in).nextInt();

            boolean res=checkEven(n);
            if(res==true)
            System.out.println("Even");
            else
                System.out.println("odd");
        }

    public static boolean checkEven(int number) {
            boolean res;
            if(number%2!=0) res=false;
            else  res=true;

            return res;
        }
    }


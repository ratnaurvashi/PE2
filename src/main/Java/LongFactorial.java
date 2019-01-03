

public class LongFactorial {
    public static int fact(int n){
        int res=1;
        if(n>12) res=-1;
        else {
            while (n > 0) {
                res *= n;
                n--;
            }
        }
        return res;
    }

}

public class Palindrome {
    public static boolean checkPalindrome(String s)
    {
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        boolean flag;
        if(res.equals(s)){ flag=true; }
        else { flag=false; }

        return flag;
    }
}

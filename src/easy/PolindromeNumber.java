package easy;

public class PolindromeNumber {

    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int xCopy=x;
        int reverse=0;
        while (x!=0){
            int remainder = x%10;
            reverse=reverse*10+remainder;
            x/=10;
        }
        if (reverse==xCopy){
            return true;
        } else return false;
    }

}

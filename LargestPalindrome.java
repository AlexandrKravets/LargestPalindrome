/**
 * Created by Kravets on 16.01.2017.
 */
public class LargestPalindrome {

    static int largestPalindrome;

    public static void main(String[] args) {

        for (int i = 999; i >= 100; i--) {
            for (int k = 999; k >= i; k--) {
                 int product = i * k;
                 if (checkPalindrome(product)) {
                    defineLargestPalindrome(product);
                }
            }
        }
        System.out.println("Largest palindrome is " + largestPalindrome);
    }

    private static boolean checkPalindrome(int number) {
        boolean result=false;
        int reverseNumber = reverseNumber(number);
        if(number == reverseNumber){
            result=true;
        }
        return result;
    }


    private static int reverseNumber(int number) {
       String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();
        return Integer.parseInt(reverse) ;
    }


    public static void defineLargestPalindrome(int palindrome) {
            if (palindrome > largestPalindrome) {
                largestPalindrome = palindrome;
            }
    }

}

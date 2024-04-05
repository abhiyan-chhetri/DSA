public class Palindrome {

    /**
     * We are given an n-digit number. The task is to find if the number is palindrome or not, provided that, n>=0.
     * If the Reversed Number is equal to the original number, then the number is said to be a palindrome number, otherwise not.
     */
    public static void main(String[] args) {

        System.out.println(checkPalindrome(1));

    }

    static boolean checkPalindrome(int number){
        int reversedNumber = 0;
        int intitalNumber = number;
        while(number > 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return reversedNumber == intitalNumber;
    }
}

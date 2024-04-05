public class Palindrome {
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

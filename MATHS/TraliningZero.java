public class TraliningZero {

    /**
     * We are given a number. The task is to find the Number of Trailing Zeros in the factorial of the number.
     *The Trailing Zeros are the Zeros, which appear at the end of a number(factorial in that case)
     */

    public static void main(String[] args) {
        System.out.println(betterfindTrailiningZero(30));
    }

    static int findTrailiningZero(int number){
        int factorial = findFactorial(number);
        System.out.println(factorial);

        int zeros = 0;
        while (factorial % 10 == 0){
            factorial /= 10;
            zeros++;
        }
        return zeros;
    }

    static int findFactorial(int number){
        if(number == 1){
            return 1;
        }
        return number * (findFactorial(number -1));
     }

     /**
      * better solution ;
      * which solves the problem of overflow. For example if number is 100, its solution cannot be stored in int and overflow occurs.
      * We get 0 if we have pair of of 5 and 2 in prime factor of factorial, no. of 5 < number of 2
      * For example in 6! = 6*5*4*3*2*1 here we have one 5*2 so we have one trailing 0 we can also do 6/5 = 1
      * 10! = 1*2*3*4*5*6*7*8*9*10 , here we have 2 pair of 5*2 (5, 2 and 10) so we have 2 trailing 0 10/5 = 1
      * but for 25 we have 25/5 = 5 , here we have one additional 5 in prime factorial so we have 5 + 1 trailing zeros i.e 25/5 = 5 /5 =1 so total 5+1 = 6
      * we can recursively perform /5 and get the total number of trailing zeros
      */

     static int betterfindTrailiningZero(int n){
        if (n / 5 == 0){
            return 0;
        }
        return (n / 5) + betterfindTrailiningZero(n / 5);
     }
}

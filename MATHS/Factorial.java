public class Factorial {

    /**
     * We are given a number. The task is to find the factorial of the number.
     * The factorial (n!) of a number is the product of all the integers from 1 to that number, i.e,
     *    n! = 1*2*3*.....(n-1)*n
     */

     public static void main(String[] args){

        System.out.println(findFactorial(4));
     }

     // recursion to find factorial
     static int findFactorial(int number){
        //base case
        if(number == 1){
            return 1;
        }
        return number * (findFactorial(number -1));
     }
}

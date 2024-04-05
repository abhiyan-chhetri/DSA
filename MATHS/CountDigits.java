public class CountDigits{

    /**
     * Problem Description: We are given an n-digit number. The task is to find the number of digits in the number, provided that, n>0.
     */
    public static void main(String[] args){

        System.out.println(count(192322));

    }

    public static int count(int number){
        int count = 1;
        while(number > 10){
            number /= 10;
            count++;
        }
        return count;
    }
}

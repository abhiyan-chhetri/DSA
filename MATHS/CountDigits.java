public class CountDigits{

    public static void main(String[] args){

        System.out.println(count(192322));

    }

    //my solution
    public static int count(int number){
        int count = 1;
        while(number > 10){
            number /= 10;
            count++;
        }
        return count;
    }

    //geeksforgeeks solution
    static int countDigits(int x)
	{
		int res = 0;

		while(x > 0)
		{
				x = x / 10;

				res++;
		}

		return res;
	}
}

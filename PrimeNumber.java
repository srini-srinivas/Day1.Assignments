package Welcome;

public class PrimeNumber {
	
	public static void main(String args[])
	{
		int temp;
		boolean isPrime = true;
		int number = 7;
		for(int i=2 ; i<=number/2 ; i++ )
		{
			temp = number / i;
			System.out.println("temp = "+temp);
			if(temp == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime)
		{
			System.out.println(number+ " is a prime  number");

		}
		else
		{
			System.out.println(number+ " is not a prime number");

		}
	}

}

package Welcome;

public class FibonacciSeries {
	
	public static void main(String args[])
	{
		int count=7, num1=0, num2=1;
		
		int i = 1;
		while(i <= count)
		{
			System.out.println(num1+ " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;

		}
		
	}

}

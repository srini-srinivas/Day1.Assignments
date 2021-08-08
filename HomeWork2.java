package Welcome;

public class HomeWork2 {
	
	public static void main(String args[])
	//AMSTRONG NUMBER PROGRAM 
	{
		int temp, total = 0;
		int number = 370;
		int num = number;
		
		while(number != 0)
		{
			temp = number % 10;
			System.out.println("temp = "+temp);
			
			total = total + temp * temp * temp;
			System.out.println("total = "+total);
			
			number = number / 10;
			System.out.println("number = "+number);


		}
		if(total == num)
		{
			System.out.println(num+ " is an anstrong number");

		}
		else
		{
			System.out.println(num+ "is not an amstrong number");

		}
	}

}

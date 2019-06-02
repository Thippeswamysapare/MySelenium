package programs;

import java.util.Scanner;

public class FindPrimeNumber {

	static int number;
	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner read=new Scanner(System.in);
		  number=read.nextInt();
		  if(number<1)
			{
				System.out.println("Entered number is less than 1. Enter valid number");
			}
		  else 
		  	{
			  	isPrime();
		  	}
	}	
		static void isPrime()
		{
			
			int status = 0;
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
					status=1;
				 
			}
			if (status==1)
			 {
				System.out.println("Entered number "+number+" is not prime" );
			 }
			else 
				System.out.println("Entered number "+number+" is  prime" );
			 
			
			
			
		}
	

}

package programs;

import java.util.Scanner;

public class NumberPolidrom 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		
		Scanner read=new Scanner(System.in);
		
		int number=read.nextInt();
		int revNum = 0;
		int tmp;
		
		while(number>0)
		{
			tmp=number%10;
			revNum=revNum*10+tmp;
			number=number/10;
		}
		System.out.println(revNum);
		
	}

}

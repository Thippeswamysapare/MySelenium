package programs;

import java.util.Scanner;

public class ReverseOfInterger {

	public static void main(String[] args) {
		 int number;
		 int revNum=0;
		 int tmp;
		System.out.println("Enter a number");
		Scanner read=new Scanner(System.in);
		number=read.nextInt();

		while(number!=0) 
		{
			tmp=number%10;
			revNum=revNum*10+tmp;
			number=number/10;
		}
		System.out.println("Reverse of the Number is "+ revNum);
		
	}

}

package programs;

import java.util.Scanner;

public class reverseofstring 
{
	public static void main(String [] args)
	{
		String str;
		String rev="";
		System.out.println("Enter a String");
		Scanner read=new Scanner(System.in);
		str=read.nextLine();
		int len=str.length();
		System.out.println("String length is "+len);
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Original String "+str);
		System.out.println("Reverse of String in "+rev);
		
	}
}

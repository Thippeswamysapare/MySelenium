package programs;

import java.util.Scanner;

public class StringPolindrom 
{
	public static void main(String[] arg)
	{
		System.out.println("Enter a String...... ");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String rev="";
		int strLen=str.length();
		
		
		for(int i=strLen-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(str))
			System.out.println("String is polindrom");
		else
			System.out.println("String is not polindrom");
		System.out.println();
		
	}
}

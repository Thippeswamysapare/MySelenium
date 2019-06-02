package programs;

import java.util.Scanner;

public class revStringBuilder {

	public static void main(String[] args)
	{
		System.out.println("Enter a String");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		StringBuilder sb=new StringBuilder();
		
		for (int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse of a String "+sb);
		String rev=sb.reverse().toString();
		System.out.println("String is "+rev);

	}

}

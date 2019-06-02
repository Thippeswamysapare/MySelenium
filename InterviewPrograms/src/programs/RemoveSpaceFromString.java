package programs;

import java.util.Scanner;

public class RemoveSpaceFromString {
	
	public static void main(String[] args) 
	{
	 System.out.println("Enter a String...."); 
	 Scanner read= new Scanner(System.in);
	 
	 String str=read.nextLine();
	  String newString=str.replaceAll("\\s", "");
	 // String newString=str.replaceAll("\\s", "*");
	 //String newString=str.replaceAll("\\$", "*");
	 System.out.println("String after space removed : "+newString);
	 
	}

}


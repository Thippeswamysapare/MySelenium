package programs;

import java.util.Scanner;

public class StringFunctionsOfJava {

	public static void main(String[] args) {
		
		//System.out.println("Enter a String ......");
		//Scanner read=new Scanner(System.in);
		//String str=read.nextLine();
		String resultString;
		String line="Sapre Thippeswamy";
		
		// CharAt()
		char ch=line.charAt(3);
		System.out.println("Character at the position is :"+ch);
		
		// compare()
		int comp=line.compareTo("Sapare");
		System.out.println(comp);

		
		// concat()
		resultString=line.concat(" Triverni");
		System.out.println("String concat is "+resultString);
		
		
		// contains
				System.out.println(line.contains("Sapa"));
		
		
		
		
		
		
	}

}

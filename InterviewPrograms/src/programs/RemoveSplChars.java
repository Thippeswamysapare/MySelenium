package programs;

import java.util.Scanner;

public class RemoveSplChars {

	public static void main(String[] args) {

		System.out.println("Enter String ....");
		Scanner read= new Scanner(System.in);
		String str=read.nextLine();
		String newString;
		newString=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String after remove spl chars "+newString);

	}

}

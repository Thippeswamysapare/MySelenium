package programs;

import java.util.Scanner;

public class RemoveSpaceInString {

	public static void main(String[] args)
	{
		System.out.println("Enter a String with Spaces");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		StringBuffer strBfr=new StringBuffer();
		
		
		char[] strChar=str.toCharArray();
		
		for(int i=0;i<strChar.length;i++)
		{
			if((strChar[i]!=' ')&&(strChar[i]!='\t'))
			{
				strBfr.append(strChar[i]);
			}
		}
		
		System.out.println("String after space removed "+strBfr);

	}

}

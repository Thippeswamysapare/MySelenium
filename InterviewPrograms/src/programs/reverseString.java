package programs;

import java.util.Scanner;

public class reverseString

{
	public static void main(String[] args)
	{
		System.out.println("Enter a String");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String rev="";
		int len=str.length();
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of the String is "+rev);
		revStringAppend();
		revStringReversefn();
	}



    public static void revStringAppend()
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }
        
        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
    }
    
    
    public static void revStringReversefn()
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}



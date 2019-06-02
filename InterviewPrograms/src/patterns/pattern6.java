package patterns;

public class pattern6 
{
public static void main(String[] args)
{
	int number=7;
	int count=number;
	for(int i = number; i>=1; i--)
	{
	for(int j = number; j>i; j--)
	{
	System.out.print(" ");
	}
	for(int k = 1; k<(i*2); k++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
}	
	
}

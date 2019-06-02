package patterns;

public class pattern7 
{
	public static void main(String[] args) {
		
	
	int number=6;
	int count =number-1;
	
	for (int i=1;i<=number;i++)
	{
		for (int j=1;j<=count;j++)
		{
			System.out.print(" ");
		}
		count--;
		for(int k=1;k<=i;k++)
		{
			System.out.print(" "+k);
		}
		System.out.println();
	}
}
}


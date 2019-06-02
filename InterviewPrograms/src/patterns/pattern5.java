package patterns;

//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************


public class pattern5 
{
	public static void main(String[] args) 
	{
		int number=7;
		int count=number-1;
		 
		
		for (int k=1;k<=number;k++)
		{
			for (int i=1;i<=count;i++)
			{
				System.out.print(" ");
			}
			count--;//6  5 
			for(int j=1;j<=(2*k-1);j++)
					{
				System.out.print("*");
					}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--)
		{
			for (int j=7;j>i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<(2*i);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

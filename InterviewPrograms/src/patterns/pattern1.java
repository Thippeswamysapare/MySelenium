package patterns;

import org.testng.annotations.Test;

public class pattern1 {
// 
//	*
//	**
//	***
//	****
//	*****
		 @Test
		void pattern1()
		{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
		
		 
		
	}

	
	
	


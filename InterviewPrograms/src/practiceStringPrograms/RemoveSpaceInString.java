package practiceStringPrograms;

public class RemoveSpaceInString 

{
		public static void main(String [] arg)
		{
			String str1="Sapare Thippeswamy 123";
			String resultStr="";
			String[] splt;
			resultStr=str1.replace(" ", "");
			System.out.println("Resultant string is "+resultStr);
			
			splt=str1.split("\\s");
			for(int i=0;i<splt.length;i++)
			{
				System.out.println(splt[i]);
				
			}
		}
}

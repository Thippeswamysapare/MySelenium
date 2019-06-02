package practiceStringPrograms;

public class RemoveSplChars 
{
	public static void main(String[] arg)
	{
			String str1="Sapare@Thip#";
			String splChars="!@#$%^&*";
			StringBuffer result=new StringBuffer();
			int strLen=str1.length();
			int charLen=splChars.length();
			
			for (int i=0;i<strLen;i++)
			{
				for(int j=0;j<charLen;j++)
				{
					if(str1.charAt(i)==splChars.charAt(j))
					{
						str1=str1.replace(splChars.charAt(j), ' ');
					}
					 
				}
			}
			System.out.println("Final result is --->"+str1);
			
	}
}

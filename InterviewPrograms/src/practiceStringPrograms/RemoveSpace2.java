package practiceStringPrograms;

public class RemoveSpace2 
{
	public static void main(String[] args)
	{
		String str1="Thippe swamy sapare";
		String str2="";
		
		int len=str1.length();
		char[] ch=str1.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			if((str1.charAt(i)!=' ') && (str1.charAt(i)!='\t'))
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println("Original String is----> "+str1);
		System.out.println("Result is ---->"+str2);
	}
}

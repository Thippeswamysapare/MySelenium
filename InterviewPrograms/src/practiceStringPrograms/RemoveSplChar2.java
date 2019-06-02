package practiceStringPrograms;

public class RemoveSplChar2 
{
	public static void main(String[] arg)
	{
		String str1="Thip*&(peswamy@sapare#$";
		String newStr="";
		newStr=str1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("New String is "+newStr);
	}
}

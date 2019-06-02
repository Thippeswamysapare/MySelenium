package practiceStringPrograms;

public class ReverseOfString 
{
	
	public static void  main(String[] args)
	{
	String str1="Thippeswamy Sapare";
	String rev="";
	String org="";
	int len=str1.length();
	 System.out.println("Length of the String is----> "+len);
	 
	 for (int i=len-1;i>=0;i--)
	 {
		 rev=rev+str1.charAt(i);
		 
	 }
	 
	  
	 System.out.println("Reverse of the Strig is --->"+rev);
	 
	 

	 for(int j=rev.length()-1;j>=0;j--)
	 {
		 org=org+rev.charAt(j);
	 }
	 System.out.println("Original String is --->"+org);
	
}
	
	
}

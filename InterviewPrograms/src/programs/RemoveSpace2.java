package programs;

public class RemoveSpace2 {

	public static void main(String[] args) {
		 
		String s1="Sapare Thippeswamy Triveni";
		String s2="";
		StringBuffer s3=new StringBuffer();
		int count=s1.length();
		
		
		for (int i=0;i<count;i++)
		{
			if(s1.charAt(i)==' ')
			{
				s3=s3.append("");
			}
			else
				s3=s3.append(s1.charAt(i));
			
		}	
		System.out.println("Original String is "+s1);
	System.out.println("Resultant String is "+s3);
	char[] splChars= {'!','@','#','$','%','^','&','*'};
	String splch="!@#$%^&*";
			int splCharCount=splch.length();
	String s4="Sapare$Thip&peswamy";
	 
	int count1=s4.length();
	for (int i=0;i<count1;i++)
	{
		for (int j =0;j<splCharCount;j++)
		{
		 if(s4.charAt(i)==splch.charAt(j))
		 {
			  s4= s4.replace(splch.charAt(j), ' ');
		 }
		  
		 
		}
	}
	System.out.println("String aftre removal of Spl Chars: "+s4);
}
}
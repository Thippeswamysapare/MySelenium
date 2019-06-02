package programs;

public class StringCompare {

	public static void main(String[] args) {
		String str1="Welcome to Java Selenium Welcome to python welCome";
		String str2="Welcome";
		int count=0;
		String str[];
		str=str1.split("\\s");
		int len=str.length;
		for (int i=0;i<len;i++)
		{
			//System.out.println(str[i]);
			if(str[i].equalsIgnoreCase(str2))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
				
		
		

	}

}

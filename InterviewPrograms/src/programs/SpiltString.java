package programs;

public class SpiltString {
//method splits this string against given regular expression and returns a char array.
	public static void main(String[] args) 
	{
	 String s1="This is out country";
	 String split[]=s1.split("\\s");
	 
	 for(String sp : split)
	 {
		 System.out.println(sp);
	 }
		
	}

}

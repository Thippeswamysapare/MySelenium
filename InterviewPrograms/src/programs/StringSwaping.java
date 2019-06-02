package programs;

public class StringSwaping {

	public static void main(String[] args) {
	 
		String s1="Sapare Thippeswamy triveni";
		String[] splitStr=s1.split(" ");
		//System.out.println(spictStr.length);
		
		for (int i=splitStr.length-1;i>=0;i--)
		{
			System.out.print(splitStr[i]+" ");
		}		
	}
}

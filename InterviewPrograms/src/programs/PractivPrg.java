package programs;

public class PractivPrg {

	public static void main(String[] args) 
	{
	  
	 
	 String str1 = new String("hello javatpoint how r u");  
     char[] ch1 = new char[10];  
     try{  
        str1.getChars(6, 16, ch1, 0);  
        System.out.println(ch1);  
     }catch(Exception ex){System.out.println(ex);}
     
	}

}

package programs;

import java.util.HashSet;
import java.util.Set;

public class removeduplicatesfromaString {

	public static void main(String[] args) {
		
		String input = new String("aabbccdefatafaz");
        String output = " ";
         char[] chars=input.toCharArray();
          
         Set<Character> charSet =new HashSet<Character>();
         for(char c:chars)
         {
        	 charSet.add(c);
         }
         StringBuilder sb=new StringBuilder();
         for(Character character:charSet)
         {
        	 sb.append(character);
         }
         System.out.println(sb.toString());
	}

} 
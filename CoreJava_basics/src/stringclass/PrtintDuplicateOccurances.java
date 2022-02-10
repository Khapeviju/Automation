package stringclass;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class PrtintDuplicateOccurances {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		
		char chars[]= str.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<chars.length;i++) {
			
			if(map.containsKey(chars[i]))
			{
				map.put(chars[i], map.get(chars[i])+1);
			}
			else {
				map.put(chars[i], 1);
			}
		}
		System.out.println("The Duplicate Characters in the Strng:");
		for (Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>=2)
			{
				System.out.println(entry.getKey());
			}
			{
				
			}
		}
	
			
	}
}

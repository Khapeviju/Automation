package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaoInterface {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(5,  "Ashish");
		map.put(9, "Babita");
		map.put(3, "Mohit");
		
		System.out.println(map.get(3));
		
		//Anand - True
		//Danish - False
		//Karishma - false
		//Mohit - True
		
		Set<Integer> keys= map.keySet();
		
		for(int key:keys)
		{
			System.out.println(map.get(key));
			
		}
	}

}

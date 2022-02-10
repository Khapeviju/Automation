package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();//Does'nt preserve the order
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Danish");
		set.add("Ashish");
		set.add("Vijay");
		set.add("Priya");
		
		for (String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("******************");
		
        set = new LinkedHashSet<>(); //Preserves the insertion order
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Danish");
		set.add("Ashish");
		set.add("Vijay");
		set.add("Priya");
		
		
		for (String s:set)
		{
			System.out.println(s);
		}
		

		System.out.println("******************");
		
        set = new TreeSet<>();  //Default sorted
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Danish");
		set.add("Ashish");
		set.add("Vijay");
		set.add("Priya");
		
		
		for (String s:set)
		{
			System.out.println(s);
		}
		
	}

}

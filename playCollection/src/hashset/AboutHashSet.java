package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AboutHashSet {
	 public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		names.add("garren");

		names.add("garren");
	
		names.add("xxx");
		
		names.add("pppp");
		System.out.println(names);
		
		//advanced ... foreach
		for(String i:names) {
			System.out.println("advanced i:"+i);
		}
		
		//iterator
		for(Iterator<String> iterator=names.iterator();iterator.hasNext();) {
			String i=(String)iterator.next();
			System.out.println("iterator:  "+i);
		}
	 }
}

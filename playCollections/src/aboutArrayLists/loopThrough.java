package aboutArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class loopThrough {
	public static void main(String[] args) {
		List<Hero> heros=new ArrayList<Hero>();
		for(int i=0;i<5;i++) {
			heros.add(new Hero("hero name"+i));
		}
		System.out.println("--for loop--");
		for(int i=0;i<heros.size();i++) {
			Hero h=heros.get(i);
			System.out.println(h);
		}
		
		System.out.println("-----------iterator-------------------");
		System.out.println("while iterator");
		Iterator<Hero> it=heros.iterator();
		while(it.hasNext()) {
			Hero h=it.next();
			System.out.println(h);
		}
		System.out.println("fot iterator");
		for(Iterator<Hero> iterator=heros.iterator();
				iterator.hasNext();
				) {
			Hero h=(Hero)iterator.next();
			System.out.println(h);
		}
		
		System.out.println("---super for----");
		 for (Hero h : heros) {
	            System.out.println(h);
	        }
		 
		
	}
}

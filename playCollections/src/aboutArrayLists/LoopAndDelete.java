package aboutArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopAndDelete {
	public static void main(String[] args) {
		List<Hero> heros=new ArrayList<>();
		//init
		for(int i=0;i<100;i++) {
			heros.add(new Hero("hero"+i));
		}
		System.out.println(heros);
		
		//temp prepare to delete
		 List<Hero> deletingHeros = new ArrayList<>();
		//loopAndDelete
		for(Iterator<Hero> iterator=heros.iterator();iterator.hasNext();) {
			Hero h=(Hero)iterator.next();//very Important AN object
			 int id = Integer.parseInt(h.name.substring(4));
			 if(0==id%8) {
				 deletingHeros.add(h);
				 
			 }
		}
		System.out.println(deletingHeros);
		heros.removeAll(deletingHeros);//delete all deletingHeros`s elements in heros
		//or
		//loop deletingHeros remove single elements one by one
//		  for (Hero h : deletingHeros) {
//	            heros.remove(h);
//	        }
		System.out.println(heros);
	}
	
}

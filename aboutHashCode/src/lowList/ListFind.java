package lowList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFind {
	public static void main(String[] args) {
//	create objects
		List<Hero> heros=new ArrayList<>();
		for(int i=0;i<2000000;i++) {
			Hero hero=new Hero("hero "+i);
			heros.add(hero);
		}
		
		System.out.println(heros.get(1000000).name);
		List<Long> save = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Collections.shuffle(heros);
			long start=System.currentTimeMillis();
			String target="hero 1000000";
			for(Hero h:heros) {
				
				if(h.name.equals(target)) {
					System.out.println("find it");
					break;
				}
				
			}
			long end=System.currentTimeMillis();
			long elapsed=end-start;
			save.add(elapsed);
			System.out.println(elapsed);
		}
		long sum=0;
		for(int i=0;i<save.size();i++) {
			sum+=(long)save.get(i);
			
		}
		System.out.println(sum/10);
	}
}

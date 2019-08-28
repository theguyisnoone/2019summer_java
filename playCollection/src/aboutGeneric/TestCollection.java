package aboutGeneric;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		List heros=new ArrayList();
		heros.add(new Hero("garren"));
		heros.add(new Item("ice stick"));
		
		Hero h1=(Hero)heros.get(0);
//		Hero h2=(Hero)heros.get(1);//must have error?
		
		//Generic
		List<Hero> genericheros=new ArrayList<Hero>();
		//equalsTO List<Hero> genericheros=new ArrayList<>();
		genericheros.add(new Hero("garren"));
		genericheros.add(new ADHero("xxxxx"));
		
		Hero h=genericheros.get(1);
		System.out.println(h.getName());//cause h only got the functions of h
		//even structure function
		
		
		List<LoL> both=new ArrayList<>();
		both.add(new Item("item"));
		both.add(new Hero("sniper"));
		for(LoL x:both) {
			System.out.println(x);
		}
		System.out.println(both);//all elements rewrite toString()  unless you will get object like ..@..
	}
}

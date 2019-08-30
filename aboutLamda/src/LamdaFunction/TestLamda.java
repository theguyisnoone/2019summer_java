package LamdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLamda {
	public static void main(String[] args) {
		Random  r=new Random();
		List<Hero> heros=new ArrayList<>();
		for(int i=0;i<5;i++) {
			heros.add(new Hero("Hero "+i,r.nextInt(100),r.nextInt(100)));
		}
		System.out.println(heros);
		 HeroChecker c=h->h.hp>100&h.damage<50;//lamda
		 filter(heros,c);
	}

	private static void filter(List<Hero> heros, HeroChecker c) {
		// TODO Auto-generated method stub
		for(Hero h:heros) {
			if(c.test(h))
				System.out.println(h);
		}
	}
}

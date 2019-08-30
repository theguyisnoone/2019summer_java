package lamdaClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda {
	public static void main(String[] args) {
		Random r=new Random();
		List<Hero> heros=new ArrayList<Hero>();
		for(int i=0;i<5;i++) {
			heros.add(new Hero("Hero "+i,r.nextInt(100),r.nextInt(100)));
			
		}
		System.out.println(heros);
		HeroChecker checker=new HeroChecker() {
			public boolean test(Hero h) {
				return (h.hp>100 & h.damage<50);
			}
		};
		 filter(heros,checker);
	}

	private static void filter(List<Hero> heros, HeroChecker checker) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
	}
}

package charactor;

public class SupportHero extends Hero{
	
	public SupportHero(String name) {
		super(name);
	}
	public void heal() {
		System.out.println("add blood");
	}
	
	public void heal(Hero h) {
		System.out.println("add "+h.name+"`sblood");
	}
	
	public void heal(Hero ...heros) {
		for(int i=0;i<heros.length;i++) {
			System.out.println("add "+heros[i].name+"`sblood");
		}
	}
	
	public void heal(Hero h,int hp) {
		h.hp+=hp;
		System.out.println(h.name+"add "+hp);
		System.out.println(h.hp);
	}
	
}


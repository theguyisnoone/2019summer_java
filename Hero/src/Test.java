
public class Test {
	public static void main(String[] args) {
		
		SupportHero a=new SupportHero("CM");
		a.heal();
		Hero one=new Hero("axes",100f);
		Hero two=new Hero("Lina");
		two.hp=100;
		a.heal(one);
		a.heal(one,two);
		a.heal(two,20);
		
	}
}

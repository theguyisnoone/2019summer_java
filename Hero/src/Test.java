import charactor.Hero;
import charactor.SupportHero;

public class Test {
	public static void main(String[] args) {
		
		SupportHero a=new SupportHero("CM");
		a.heal();
		Hero one=new Hero("axes",100f);
		Hero two=new Hero("Lina",100f,100f,10);

		a.heal(one);
		a.heal(one,two);
		a.heal(two,20);
		
	}
}

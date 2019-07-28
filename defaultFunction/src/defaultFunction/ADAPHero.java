package defaultFunction;

public class ADAPHero implements AD, AP {
	public void attack() {
//		System.out.println("....");
		AP.super.attack();
	}
	
	public static void main(String[] args) {
		ADAPHero a=new ADAPHero();
		a.attack();
	}
}


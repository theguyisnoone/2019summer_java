package property;

public class LifePotion extends Item {

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		System.out.println("xxx");
		return true;
	}
	
	public static void main(String[] args) {
		LifePotion l=new LifePotion();
		boolean result=l.disposable();
		if( result==true) {
			System.out.println("no more");
			}
	}
	
}

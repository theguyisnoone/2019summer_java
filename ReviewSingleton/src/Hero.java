//hungry
public class Hero {
	public String name; //����
	
	public float hp; //Ѫ��
	private Hero() {
		
	}
	 private static Hero instance=new Hero();
	 
	 public static Hero getInstance() {
		 return instance;
	 }
}

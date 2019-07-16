//hungry
public class Hero {
	public String name; //ĞÕÃû
	
	public float hp; //ÑªÁ¿
	private Hero() {
		
	}
	 private static Hero instance=new Hero();
	 
	 public static Hero getInstance() {
		 return instance;
	 }
}

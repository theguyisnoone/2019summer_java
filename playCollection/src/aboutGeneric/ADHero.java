package aboutGeneric;

public class ADHero extends Hero {
   public String name;
   
	public ADHero(String name){
	   this.name=name;
   }
	public String getName() {
		return name;
	}
	public void physicAttack() {
	   System.out.println("ÎïÀí¹¥»÷");
   }
   
   public void die() {
   	System.out.println(name+"AD DIE");
   	
   }
   
   public String toString() {
       return name;
   }
}

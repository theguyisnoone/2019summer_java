package reviewAbstract;



public class ADHero extends Hero implements AD{
   public void physicAttack() {
	   System.out.println("ÎïÀí¹¥»÷");
   }
   


@Override
public void attack() {
	physicAttack();
	
}
}

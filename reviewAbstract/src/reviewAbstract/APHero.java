package reviewAbstract;




public class APHero extends Hero implements AP{
		   public void magicAttack() {
			   System.out.println("ÎïÀí¹¥»÷");
		   }
		   
		   public void die() {
		    	System.out.println("AP DIE");
		    	
		    }

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			magicAttack();
		}
}

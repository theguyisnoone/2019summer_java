package charactor;

import other.Mortal;

public class APHero extends Hero implements AP,Mortal {
		   public void magicAttack() {
			   System.out.println("ÎïÀí¹¥»÷");
		   }
		   
		   public void die() {
		    	System.out.println("AP DIE");
		    	
		    }
}

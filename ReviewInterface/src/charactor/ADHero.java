package charactor;

import other.Mortal;

public class ADHero extends Hero implements AD,Mortal{
   public void physicAttack() {
	   System.out.println("������");
   }
   
   public void die() {
   	System.out.println(name+"AD DIE");
   	
   }
}

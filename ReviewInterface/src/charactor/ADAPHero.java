package charactor;

import other.Mortal;

public class ADAPHero extends Hero implements AD,AP,Mortal{
  
    @Override
    public void magicAttack() {
        System.out.println("����ħ������");
    }
  
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
  
    
    public void die() {
    	System.out.println("ADAP DIE");
    	
    }
}

package conCurrency.problem;

public class Hero {
	 public String name;
	    public int hp;
	     
	    public int damage;
	     
	    //��Ѫ
	    public void recover(){
	        hp=hp+1;
	    }
	     
	    //��Ѫ
	    public void hurt(){
	        hp=hp-1;
	    }
	     
	    public void attackHero(Hero h) {
	        h.hp-=damage;
	        System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %d",name,h.name,h.name,h.hp);
	        if(h.isDead())
	            System.out.println(h.name +"���ˣ�");
	    }
	  
	    public boolean isDead() {
	        return 0>=hp?true:false;
	    }                                                                                     
}

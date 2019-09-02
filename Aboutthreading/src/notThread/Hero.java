package notThread;

public class Hero {
	public String name;
	public float hp;
	public int demage;
	
	public  void attackHero(Hero h) {
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		h.hp-=demage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead()) {
        	System.out.println(h.name+" is dead！");
        	
        }
	}

	boolean isDead() {
		// TODO Auto-generated method stub
		return 0>=hp?true:false;
	}
}

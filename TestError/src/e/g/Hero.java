package e.g;
public class Hero {
	public String name;
	protected  float hp;
	public void attackHero(Hero h) throws HeroIsDeadException{
		if(h.hp==0) {
			 
			throw new HeroIsDeadException(h.name +"is dead");
		}
	}
	
	   public String toString(){
	        return name;
	    }
	   
	   public static void main(String[] args) {
	         
	        Hero garen =  new Hero();
	        garen.name = "����";
	        garen.hp = 616;
	 
	        Hero teemo =  new Hero();
	        teemo.name = "��Ī";
	        teemo.hp = 0;
	         
	        try {
	            garen.attackHero(teemo);
	             
	        } catch (HeroIsDeadException e) {
	            // TODO Auto-generated catch block
	            System.out.println("�쳣�ľ���ԭ��:"+e.getMessage());
	            e.printStackTrace();
	        }
	         
	    } 
}

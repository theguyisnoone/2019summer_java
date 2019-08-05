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
	        garen.name = "盖伦";
	        garen.hp = 616;
	 
	        Hero teemo =  new Hero();
	        teemo.name = "提莫";
	        teemo.hp = 0;
	         
	        try {
	            garen.attackHero(teemo);
	             
	        } catch (HeroIsDeadException e) {
	            // TODO Auto-generated catch block
	            System.out.println("异常的具体原因:"+e.getMessage());
	            e.printStackTrace();
	        }
	         
	    } 
}

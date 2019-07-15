package charactor;

import property.Weapon;

public class Hero {
	
	public String name; //姓名
	
	public float hp; //血量
	
	public float armor; //护甲
	
	public int moveSpeed; //移动速度
	
	static String copyright;//类属性,静态属性

//	public void equip(Weapon w) {
//		
//	}
	
	public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
         
        Hero.copyright = "版权由Riot Games公司所有";
         
        System.out.println(garen.name);
        System.out.println(garen.copyright);
         
        Hero teemo =  new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);    
        System.out.println(teemo.copyright);
        
        //edit static attribute
        garen.copyright="Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);
 }

	
}

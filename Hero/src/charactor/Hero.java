package charactor;

import property.Weapon;

public class Hero {
	
	public String name; //姓名
	
	public float hp; //血量
	
	public float armor; //护甲
	
	public int moveSpeed; //移动速度
	
	public Hero(String name){
		this.name=name;
		System.out.println("hero 构造"+name);
	}
	
	
	public  Hero(String heroName,float heroHp){
		this(heroName);//!!!
		this.hp=heroHp;
		System.out.println("invoke one");
	}
	
	public Hero(String name,float hp,float armor,int moveSpeed){
		this(name,hp);
		this.armor=armor;
		this.moveSpeed=moveSpeed;
		System.out.println("invoke two");
	}

	public void equip(Weapon w) {
		
	}
	
	

	
}

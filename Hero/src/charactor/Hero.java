package charactor;

import property.Weapon;

public class Hero {
	
	public String name; //����
	
	public float hp; //Ѫ��
	
	public float armor; //����
	
	public int moveSpeed; //�ƶ��ٶ�
	
	public Hero(String name){
		this.name=name;
		System.out.println("hero ����"+name);
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

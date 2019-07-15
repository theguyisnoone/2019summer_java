
public class Hero {
	
	String name; //姓名
	
	float hp; //血量
	
	float armor; //护甲
	
	int moveSpeed; //移动速度
	
	Hero(String name){
		this.name=name;
		System.out.println("hero 构造"+name);
	}
	
	Hero(String heroName,float heroHp){
		
		this(heroName);
		this.hp=heroHp;
		
	}


	

	
}

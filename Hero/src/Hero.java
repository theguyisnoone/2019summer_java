
public class Hero {
	
	String name; //����
	
	float hp; //Ѫ��
	
	float armor; //����
	
	int moveSpeed; //�ƶ��ٶ�
	
	Hero(String name){
		this.name=name;
		System.out.println("hero ����"+name);
	}
	
	Hero(String heroName,float heroHp){
		
		this(heroName);
		this.hp=heroHp;
		
	}


	

	
}

package charactor;

import property.Weapon;

public class Hero {
	
	public String name; //����
	
	public float hp; //Ѫ��
	
	public float armor; //����
	
	public int moveSpeed; //�ƶ��ٶ�
	
	static String copyright;//������,��̬����

//	public void equip(Weapon w) {
//		
//	}
	
	public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "����";
         
        Hero.copyright = "��Ȩ��Riot Games��˾����";
         
        System.out.println(garen.name);
        System.out.println(garen.copyright);
         
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        System.out.println(teemo.name);    
        System.out.println(teemo.copyright);
        
        //edit static attribute
        garen.copyright="Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);
 }

	
}

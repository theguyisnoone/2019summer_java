package charactor;

import other.Mortal;

public class Hero {
	
	public String name; //����
	
	public float hp; //Ѫ��
	
	//��дequals
	public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
//            System.out.println(this.hp == h.hp);
            return this.hp == h.hp;
        }
        return false;
    }
	
	public void kill(Mortal m) {
		
		System.out.println("kill  "+m);
		m.die();
	}
	
	public static void main(String[] args) {
		  Hero h1= new Hero();
	        h1.hp = 300;
	        Hero h2= new Hero();
	        h2.hp = 400;
	        Hero h3= new Hero();
	        h3.hp = 300;
	         
	        System.out.println(h1.equals(h2));
	        System.out.println(h1.equals(h3));
		
//	        Hero garren=new Hero();
//	       ADHero ad=new ADHero();
//	       ad.name="xx";
//	       System.out.println(ad.toString());
//	       ADAPHero adap=new ADAPHero(); 
//	       APHero ap=new APHero();
//	        garren.kill(ad);
//	        garren.kill(adap);
//	        garren.kill(ap);
//	        
//	         �ж϶�������
//	        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
//	        System.out.println(h1 instanceof ADHero);

	}
	
	
	
}

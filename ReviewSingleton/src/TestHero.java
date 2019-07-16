
public class TestHero {
	public static void main(String[] args) {
 
         
        Hero g1 = Hero.getInstance();
        Hero g2 = Hero.getInstance();
        
         
        //都是同一个对象
        System.out.println(g1);
        System.out.println(g2);
    }
}

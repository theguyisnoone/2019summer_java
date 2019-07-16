import java.util.Scanner;

public class test {
	 public static void main(String[] args) {
//		    System.out.println("print a type:");
//		    Scanner scan=new Scanner(System.in);
//		    String type=scan.nextLine();
	        HeroType heroType = HeroType.TANK;
	        switch (heroType) {
	        case TANK:
	            System.out.println("tank");
	            break;
	        case WIZARD:
	            System.out.println("WIZARD");
	            break;
	        case ASSIST:
	            System.out.println("ASSIST");
	            break;
	        case PUSH:
	            System.out.println("PUSH");
	            break;
	        }
	        
	        //±éÀú
	        for(HeroType hero:HeroType.values()) {
	        	System.out.println(hero);
	        }
	    }
}


public class TestItem {
	  public static void main(String[] args) {
		  Item  g1 = Item.getInstance();
		    Item g2 = Item.getInstance();
		    
		     
		    //都是同一个对象
		    System.out.println(g1);
		    System.out.println(g2);
	}
  
}


public class Item {
	String name;
    int price;
    
    private Item() {
    	
    }
    
    private static Item instance;
    
    public static Item getInstance() {
    	if(null == instance) {
    		instance=new Item();
    	}
    	return instance;
    }
    
    
}

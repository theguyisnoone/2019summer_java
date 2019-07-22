package property;

public class Item {
	String name;
    int price;
 
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
    
    public String toString() {
		return name+" "+price;			
    }
    
    public void finalize() {
    	System.out.println("recylcing");
    }
 
    public boolean equals(Object o) {
    	//判断是否Item
    	if(o instanceof Item) {
    		Item i=(Item)o;
    		return this.price==i.price;//直接写o的price不行 要转换
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
        Item item=new Item();
        item.name="xx";
        item.price=1;
         System.out.println(item.toString());
         Item i2=new Item();
         i2.price=1;
         System.out.println(item.equals(i2));
//    	for(int i=0;i<5000000;i++) {//要足够多才显示
//    		Item	it=new Item();
//		}
	}
}

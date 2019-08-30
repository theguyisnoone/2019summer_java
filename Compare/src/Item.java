
public class Item implements Comparable<Item>{
	private String name;
	private int price;
	Item(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public int compareTo(Item another ) {
		if(price<another.price) {
			return 1; //>0 change
		}else {
			return -1;//not change
		}
		
	}
	
	public String toString() {
        return "Item [name=" + name + ", price=" + price + "]\r\n";
    }
}

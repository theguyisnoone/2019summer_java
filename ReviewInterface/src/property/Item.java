package property;

public class Item {
	String name;
    int price;
 
    public void buy(){
        System.out.println("����");
    }
    public void effect() {
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
    
    public String toString() {
		return name+" "+price;			
    }
    
    public void finalize() {
    	System.out.println("recylcing");
    }
 
    public boolean equals(Object o) {
    	//�ж��Ƿ�Item
    	if(o instanceof Item) {
    		Item i=(Item)o;
    		return this.price==i.price;//ֱ��дo��price���� Ҫת��
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
//    	for(int i=0;i<5000000;i++) {//Ҫ�㹻�����ʾ
//    		Item	it=new Item();
//		}
	}
}

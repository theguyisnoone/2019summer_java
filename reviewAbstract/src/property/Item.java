package property;

import property.ClassinClass.notStatic;

public abstract class Item {

	String name;
	int price;
	public  abstract boolean disposable();
	static class test{
		public void show() {
		System.out.println("static class!");	
		}
	}
	
	class notStatic{
		public void show() {
			System.out.println("lm not static!");
		}
	}
	
	public static void main(String[] args) {
		//static class not need item object
		Item.test i=new Item.test();
		i.show();
		
		
		
		
		//anonymous class
		String jaja="jaja";
		Item xx=new Item() {
			public boolean disposable() {
				System.out.println(jaja);
				return true;
			}
		};
		xx.disposable();
		//need item object !!class in class  but not static
		notStatic n=xx.new notStatic();
		n.show();
		
		
		//local class
		class Life extends Item{
			public boolean disposable(){
				System.out.println("local");
				return true;
		
			}
			
		};
		Life a=new Life();
		a.disposable();
		
		
	}
}

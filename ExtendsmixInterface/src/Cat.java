
public class Cat extends Animal {
	String name;
	//empty 
	Cat(){
		this ("");
	}
	//super
	Cat(String name){
		super(4);
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		System.out.println(name);
		return  this.name;
		
	}
	
	public void play() {
		System.out.println(" cat play");
	}
	
	public void eat() {
		System.out.println("cat eat");
	}
	
	
}

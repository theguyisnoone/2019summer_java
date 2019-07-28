
public class Fish extends Animal implements Pet {
    private String name;
	protected Fish(){
    	super(0);
    }
	
	public void setName(String name) {
		this.name=name;
	}
    public String getName() {
    	return name;
    }
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("fish eat");
	}
	
	 public void play() {
		System.out.println("fish play");
	}
	 
	 public void walk() {
		 System.out.println("fish cant walk");
	 }
	
}	

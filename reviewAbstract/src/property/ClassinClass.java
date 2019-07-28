package property;

public class ClassinClass {
	public void show() {
		System.out.println("pppp");
	}
	class notStatic{
		public void show() {
			System.out.println("lm not static!");
		}
	}
	public static void main(String[] args) {
		ClassinClass c=new ClassinClass();
		notStatic n=c.new notStatic();
		n.show();
	}
}

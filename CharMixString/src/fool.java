
public class fool {
	/*
	 * for this LeNgEnDaRy*/
	protected static void frequency(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] = Character.toUpperCase(a[i]);
			}

		}
		show(a);
	} 
	
	/*
	 * for this lengendarY*/
	protected static void lastChange(char a[]) {
		a[a.length-1]=Character.toUpperCase(a[a.length-1]);
		show(a);
	} 
	
	protected static void show(char a[]) {
		String newStr=new String(a);
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		String str = "lengendary";
		char cs[] = str.toCharArray();
//		frequency(cs);
		lastChange(cs);
		
		
		
		
	}
}

public class PlayPackage {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//byte
		byte b=5;
		Byte bb=b;
		System.out.println(bb instanceof Byte);
		Byte b2=bb;
		System.out.println(b2.getClass());
		
		//short
		short s=5;
		Short ss=s;
		short s1=ss;
		
		//float
		float f=1.0f;
		Float ff=f;
		float f1=ff;
		
		//double
		double d=2.0;
		Double dd=d;
		double d2=dd;
		
		byte one=2;
		//cant be auto packaged 
		Integer two=(int) one;
		
		System.out.println(Byte.MAX_VALUE);
	}
}

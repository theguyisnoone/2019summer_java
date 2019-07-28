
public class NumAndString {
	public static void main(String[] args) {
		int i=5;
		/*
		 * int  to string*/
		String str=String.valueOf(i);//way1
		
		//Integer
		Integer it=i;
		String str2=it.toString();//way2
		System.out.println(str2.getClass());
		
		/**
		 * string to int*/
		String strr="9999";
		int j=Integer.parseInt(strr);
		System.out.println(j);
		
		//test
		double d=3.14;
		Double dd=d;
		System.out.println(dd.toString());
		System.out.println(String.valueOf(d));
		
		String a="3.14";
		double aa=Double.parseDouble(a);
		System.out.println(aa);
		//throw exception  numberfORMATEXCEPTION
//		a="3.1a4";
//		aa=Double.parseDouble(a);
//		System.out.println(aa);
		
	}
}

package lowList;

public class myHashCode {
	//random String
	private static String randomString(int length) {
		String pool="";
		for(short i='0';i<'9';i++) {
			pool+=(char)i;
		}
		for(short i='a';i<'z';i++) {
			pool+=(char)i;
		}
		for(short i='A';i<'Z';i++) {
			pool+=(char)i;
		}
		char cs[]=new char[length];
		for(int i=0;i<length;i++) {
			int target=(int)(Math.random()*pool.length());
			cs[i]=pool.charAt(target);
		}
		String result=new String(cs);
		return result;
	}
	//calculate
	public static int hashcode(String str) {
		if(str.length()==0) {
			return 0;
		}else {
			char cs[]=str.toCharArray();
			int sum=0;
			for(int i=0;i<cs.length;i++ ) {
				sum+=(short)cs[i];
			
			}
			sum=sum*23;
			if(sum>1999) {
				sum=sum%2000;
			}
			if(sum<0) {
				sum=Math.abs(sum);
			}
			return sum;
		}
		
		
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			String str=randomString((int)(Math.random()*8+2));
			int hashcode=hashcode(str);
			System.out.printf("%s hashcode is %d",str,hashcode);
			System.out.println();
		}

		
	}
}

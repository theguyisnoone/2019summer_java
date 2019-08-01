
public class PowerTest {
	private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
	public static void main(String[] args) {
		int total=10000;
		String str=randomString(10);
		System.out.println(str);
		StringBuffer sb=new StringBuffer();
		String x="";
		
		long stringStart= System.currentTimeMillis() ;
		for(int i=0;i<total;i++) {
			x+=str;
		}
		long stringEnd= System.currentTimeMillis() ;
		System.out.println(stringEnd-stringStart);
		
		
		
		long sbStart= System.currentTimeMillis() ;
		for(int i=0;i<total*1000;i++) {
			sb.append(str);
		}
		long sbEnd= System.currentTimeMillis() ;
		System.out.println(sbEnd-sbStart);
		
	}
}

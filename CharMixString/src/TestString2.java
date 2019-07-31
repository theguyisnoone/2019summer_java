
public class TestString2 {
	public static void main(String[] args) {
		//first alp.. low to upper
		String str="let there be light";	
		//Let There Be Light 
		String words[]=str.split(" ");
		String change="";
		for(String sub:words){
			
			System.out.println(sub);
			char first=sub.charAt(0);
			char[] cs=sub.toCharArray();
			first= Character.toUpperCase(first);
			cs[0]=first;
			String sp=new String(cs);
			change+=sp;
			change+=' ';
			System.out.println(change);
		}
	}
}

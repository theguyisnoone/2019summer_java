
public class TestString3 {
	public static void main(String[] args) {
		String str="peter piper picked a peck of pickled peppers";
		String words[]=str.split(" ");
		int sum=0;
		for(String sub:words) {
	
			if(sub.charAt(0)=='p') {
				System.out.println(sub);
				sum+=1;
			}
			
		}
		System.out.println(sum);
				
	}
}

import java.util.Scanner;

public class TestChar {
	public  static void process(String str) {
		char[] readd=str.toCharArray();
		String resultUpper="";
		String resultDigit="";
		for(char  i:readd) {
			
			if(Character.isUpperCase(i)) {
				resultUpper+=i;
			}
			if(Character.isDigit(i)) {
				resultDigit+=i;
			}
			
		}
		System.out.println(resultUpper);
		System.out.println(resultDigit);
	}
	
	public static void main(String[] args) {
		System.out.println("print");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		process(str);
	}
}

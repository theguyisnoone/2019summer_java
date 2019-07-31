package testFormat;

public class format1 {
	public static void main(String[] args) {
		String name="jaja";
		int age=22;
		String position="king";
		String sentenceFormat="%s is %d  %n and he is %s";
		System.out.printf(sentenceFormat,name,age,position);
		System.out.println();
		System.out.format(sentenceFormat,name,age,position);
	}
}

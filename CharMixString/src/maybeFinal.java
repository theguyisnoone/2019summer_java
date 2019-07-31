
public class maybeFinal {
	public static void main(String[] args) {
		String str="Nature has given us that two ears, "
				+ "two eyes,"
				+ " and but one tongue, "
				+ "to the end that"
				+ " we should hear and see more than we speak";
		System.out.println(str.length());
		int record=str.lastIndexOf("two");
		char cs[]=str.toCharArray();
		cs[record]=Character.toUpperCase(cs[record]);
		String newStr=new String(cs);
		System.out.println(newStr);
	}
}

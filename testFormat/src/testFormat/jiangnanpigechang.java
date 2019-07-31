package testFormat;

import java.util.Scanner;

public class jiangnanpigechang {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("location:");
		String location=scan.nextLine();
		System.out.println("type:");
		String type=scan.nextLine();
		System.out.println("name:");
		String name=scan.nextLine();
		System.out.println("boss:");
		String boss=scan.nextLine();
		System.out.println("money:");
//		String  money=scan.nextLine();
		double money=scan.nextDouble();
		System.out.println("product:");
		String space=scan.nextLine();
		String product=scan.nextLine();
		System.out.println("unit of quantity:");
		String unit=scan.nextLine();
		String sentence="%s最大%s %s倒闭了，%n"
				+ "王八蛋老板%s吃喝嫖赌，欠下了%f亿，%n"
				+ "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!%n"
				+ "原价都是一%s多、两%s多、三%s多的钱包，%n"
				+ "现在全部只卖二十块，统统只要二十块!%s王八蛋，%n"
				+ "你不是人!我们辛辛苦苦给你干了大半年，%n"
				+ "你不发工资，你还我血汗钱，还我血汗钱!%n";
		System.out.format(sentence,location,type,name,boss,money,product,unit,unit,unit,boss);
	}
	
	
}

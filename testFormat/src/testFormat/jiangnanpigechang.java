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
		String sentence="%s���%s %s�����ˣ�%n"
				+ "���˵��ϰ�%s�Ժ��ζģ�Ƿ����%f�ڣ�%n"
				+ "��������С��������!����û�а취������%s�ֹ���!%n"
				+ "ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���Ǯ����%n"
				+ "����ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵���%n"
				+ "�㲻����!����������������˴���꣬%n"
				+ "�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!%n";
		System.out.format(sentence,location,type,name,boss,money,product,unit,unit,unit,boss);
	}
	
	
}

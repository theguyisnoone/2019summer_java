
public class TestNumber {
	public static void main(String[] args) {
		float f1 = 5.4f;
		float f2 = 5.5f;
		// 5.4四舍五入即5
		System.out.println(Math.round(f1));
		// 5.5四舍五入即6
		System.out.println(Math.round(f2));

		// 得到一个0-1之间的随机浮点数（取不到1）
		System.out.println(Math.random());

		// 得到一个0-10之间的随机整数 （取不到10）
		System.out.println((int) (Math.random() * 10));
		// 开方
		System.out.println(Math.sqrt(9));
		// 次方（2的4次方）
		System.out.println(Math.pow(2, 4));

		// π
		System.out.println(Math.PI);

		double result = 0;
		for (int i = 1; i < 1000; i++) {
			result = Math.pow(1 + 1d / i, i);// d
		}
		System.out.println(result);
		result = Math.pow(1 + 1d / Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println(result);
		// 自然常数
		System.out.println(Math.E);

		// ZHISHU
		int max = 10000 * 1000;
		int count = 0;
		for (int i = 1; i <= max; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
	
		System.out.println("一千万以内的质数一共有 : " + count);

	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (0 == i % j)
				return false;
		}
		return true;
	}
		

}



public class TestNumber {
	public static void main(String[] args) {
		float f1 = 5.4f;
		float f2 = 5.5f;
		// 5.4�������뼴5
		System.out.println(Math.round(f1));
		// 5.5�������뼴6
		System.out.println(Math.round(f2));

		// �õ�һ��0-1֮��������������ȡ����1��
		System.out.println(Math.random());

		// �õ�һ��0-10֮���������� ��ȡ����10��
		System.out.println((int) (Math.random() * 10));
		// ����
		System.out.println(Math.sqrt(9));
		// �η���2��4�η���
		System.out.println(Math.pow(2, 4));

		// ��
		System.out.println(Math.PI);

		double result = 0;
		for (int i = 1; i < 1000; i++) {
			result = Math.pow(1 + 1d / i, i);// d
		}
		System.out.println(result);
		result = Math.pow(1 + 1d / Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println(result);
		// ��Ȼ����
		System.out.println(Math.E);

		// ZHISHU
		int max = 10000 * 1000;
		int count = 0;
		for (int i = 1; i <= max; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
	
		System.out.println("һǧ�����ڵ�����һ���� : " + count);

	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (0 == i % j)
				return false;
		}
		return true;
	}
		

}


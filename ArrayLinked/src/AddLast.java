import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddLast {
	public static void main(String[] args) {
		List<Integer> l;
        l = new ArrayList<>();
        insertLast(l, "ArrayList");
  
        l = new LinkedList<>();
        insertLast(l, "LinkedList");
	}

	private static void insertLast(List<Integer> l, String type) {
		// TODO Auto-generated method stub
		int total=(int) 1e5;
		final int num=5;
		long start=System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
            //ֱ��add�ͱ�ʾ���������
            l.add(num);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��������%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
	}
}

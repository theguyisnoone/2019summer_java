import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class addMiddle {
	 public static void main(String[] args) {
	        List<Integer> l;
	        l = new ArrayList<>();
	        insertFirst(l, "ArrayList");
	   
	        l = new LinkedList<>();
	        insertFirst(l, "LinkedList");
	   
	    }
	   
	    private static void insertFirst(List<Integer> l, String type) {
	        int total = 1000 * 100;
	        final int number = 5;
	        long start = System.currentTimeMillis();
	        for (int i = 0; i < total; i++) {
	            //�ѵ�ǰ������һ���λ�ã���������
	            l.add(l.size()/2,number);
	        }
	        long end = System.currentTimeMillis();
	        System.out.printf("��%s ���м����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
	    }
}

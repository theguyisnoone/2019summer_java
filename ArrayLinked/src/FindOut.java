import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindOut {
	 public static void main(String[] args) {
	        List<Integer> l;
	        l = new ArrayList<>();
	        modify(l, "ArrayList");
	 
	        l = new LinkedList<>();
	        modify(l, "LinkedList");
	 
	    }
	 
	    private static void modify(List<Integer> l, String type) {
	        int total = 100 * 1000;
	        int index = total/2;
	        final int number = 5;
	        //��ʼ��
	        for (int i = 0; i < total; i++) {
	            l.add(number);
	        }
	         
	        long start = System.currentTimeMillis();
	 
	        for (int i = 0; i < total; i++) {
	             int n = l.get(index);
	             n++;
	             l.set(index, n);
	        }
	        long end = System.currentTimeMillis();
	        System.out.printf("%s�ܳ�����%d����λ����%d�����ݣ�ȡ��������1���ٷŻ�ȥ%n �ظ�%d�飬�ܹ���ʱ %d ���� %n", type,total, index,total, end - start);
	        System.out.println();
	    }
}

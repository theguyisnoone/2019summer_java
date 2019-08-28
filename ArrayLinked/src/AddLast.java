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
            //直接add就表示插入在最后
            l.add(num);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最后面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
	}
}

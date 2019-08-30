import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class reverseTreeSet {
	  public static void main(String[] args) {
	         
	        Comparator<Integer> c =new Comparator<Integer>() {
	 
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2-o1;//o2>01 return 1 big to small
	            }
	        };
	         
	        Set<Integer> treeSet = new TreeSet<>(c);
	        for (int i = 0; i < 10; i++) {
	            treeSet.add(i);
	        }
	        System.out.println(treeSet);
	    }
}

package list2;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
 
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 6);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
        //toString
        String content = Arrays.toString(a);
        System.out.println(content);
        
        //sortTools
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
        
        //search
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
	
        //judge if same
        int one[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int two[] = new int[] { 18, 62, 68, 82, 65, 8 };
 
        System.out.println(Arrays.equals(one,two));
        
        //fill
        int c[] = new int[10];
        
        Arrays.fill(c, 5);
  
        System.out.println(Arrays.toString(c));
        
        //
	}
}

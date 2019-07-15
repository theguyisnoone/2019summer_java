package list2;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
 
        // copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
        int[] b = Arrays.copyOfRange(a, 0, 6);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
        //toString
        String content = Arrays.toString(a);
        System.out.println(content);
        
        //sortTools
        System.out.println("����֮ǰ :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("����֮��:");
        System.out.println(Arrays.toString(a));
        
        //search
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //ʹ��binarySearch֮ǰ��������ʹ��sort��������
        System.out.println("���� 62���ֵ�λ��:"+Arrays.binarySearch(a, 62));
	
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

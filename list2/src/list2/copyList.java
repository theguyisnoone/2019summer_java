package list2;

public class copyList {
	 public static void main(String[] args) {
	        int a [] = new int[10];
	        for(int i=0;i<a.length;i++) {
	        	a[i]=(int)(Math.random()*100);
	        }
	        System.out.println("A:");
	        for(int value:a) {
	        	System.out.print(value+"\t");
	        }
	        int b[] = new int[3];//�����˳�����3�Ŀռ䣬����û�и�ֵ
	        
	        for(int i=0;i<b.length;i++) {
	        	b[i]=(int)(Math.random()*100);
	        }
	        System.out.println("B:");
	        for(int value:b) {
	        	System.out.print(value+"\t");
	        }
	        //ͨ�����鸳ֵ�ѣ�a�����ǰ3λ��ֵ��b����
	         
	        //����һ�� forѭ��
	         
//	        for (int i = 0; i < b.length; i++) {
//	            b[i] = a[i];
//	        }
	        
	        //������: System.arraycopy(src, srcPos, dest, destPos, length)
	        //src: Դ����
	        //srcPos: ��Դ���鸴�����ݵ���ʼλ��
	        //dest: Ŀ������
	        //destPos: ���Ƶ�Ŀ���������ʼλ��
	        //length: ���Ƶĳ���       
	        int c[]=new int[a.length+b.length]; 
	        System.arraycopy(a, 0, c, 0,a.length );
	        System.arraycopy(b, 0, c, a.length,b.length );
	         
	        //�����ݴ�ӡ����
	        System.out.println("c:");
	        for (int i = 0; i < c.length; i++) {
	            System.out.print(c[i] + " ");
	        }
	 
	    }
}

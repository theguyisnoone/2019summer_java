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
	        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
	        
	        for(int i=0;i<b.length;i++) {
	        	b[i]=(int)(Math.random()*100);
	        }
	        System.out.println("B:");
	        for(int value:b) {
	        	System.out.print(value+"\t");
	        }
	        //通过数组赋值把，a数组的前3位赋值到b数组
	         
	        //方法一： for循环
	         
//	        for (int i = 0; i < b.length; i++) {
//	            b[i] = a[i];
//	        }
	        
	        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
	        //src: 源数组
	        //srcPos: 从源数组复制数据的起始位置
	        //dest: 目标数组
	        //destPos: 复制到目标数组的启始位置
	        //length: 复制的长度       
	        int c[]=new int[a.length+b.length]; 
	        System.arraycopy(a, 0, c, 0,a.length );
	        System.arraycopy(b, 0, c, a.length,b.length );
	         
	        //把内容打印出来
	        System.out.println("c:");
	        for (int i = 0; i < c.length; i++) {
	            System.out.print(c[i] + " ");
	        }
	 
	    }
}

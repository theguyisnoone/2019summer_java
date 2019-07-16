package list2;

import java.util.Arrays;

public class lab1_re {
		public static void createValue(int a[][]) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]=(int)(Math.random()*100);
				}
			}
		}
		
		public static void showTwo(int a[][]) {
			System.out.println("showTwo");
			for(int values[]:a) {
				for(int value: values) {
					System.out.print(value+"\t");
				}
				System.out.println();
			}
		}
		
		public static void twoToOne(int a[][],int b[]) {
			for(int i=0;i<a.length;i++) {
				System.arraycopy(a[i], 0, b, a[i].length*i, a[i].length);
			}
			
		}
		
		public static void showOne(int b[]) {
			System.out.println("show one");
			for(int i:b) {
				System.out.print(i+"\t");
			}
		}
		
		public static void sort(int b[]) {
			System.out.println("after sort:");
			 Arrays.sort(b);
			 showOne(b);
		}
		
		public static void oneToTwo(int b[],int a[][]) {
			System.out.println("one to two");
			for(int i=0;i<a.length;i++) {
				System.arraycopy(b, a[i].length*i, a[i],0, a[i].length);
			}
			showTwo(a);
		}
		
		public static void main(String[] args) {
			//create 
			int a[][]=new int[5][8];
			createValue(a);
			showTwo(a);
			
			//two to one
			int b[]=new int[a.length*a[0].length];
			twoToOne(a,b);
			showOne(b);
			
			//sort
			sort(b);
		
			//one to two
			oneToTwo(b,a);
			
		}
}

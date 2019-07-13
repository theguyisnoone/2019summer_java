package list2;

public class doubleMat {
	public void init(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=(int)(Math.random()*100);
			}
		}
	}
	public void show(int a[][]) {
		for(int [] value:a) {
			for(int val: value) {
				System.out.print(val+"\t");
			}
			System.out.println();
		}
	}
	
	public void showMax(int a[][]) {
		int max=a[0][0];
		int tari=0,tarj=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					tari=i;
					tarj=j;
				}
			}
		}
		System.out.println("max:"+max+" "+"i:"+tari+" "+"j:"+tarj);
	}
	
	public static void main(String[] args) {
		doubleMat d=new doubleMat();
//		int a[][]=new int[][] {    //如果指定了数组的内容，就不能同时设置数组的长度
//		    {1,2,4},
//		    {4,5},
//		    {6,7,8,9}
//		};
		int a[][]=new int[5][5];
		d.init(a);
		d.show(a);
		d.showMax(a);
	}
	
}

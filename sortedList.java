package listReview;

//选择排序
public class sortedList {
	public void chooseSort(int a[]) {
		for (int i=0;i<a.length-1;i++) {//zuixiaode -1不要也可以 就是做了一次无效
			for(int j=i+1;j<a.length;j++) {//houmiande
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						
				}
			}
		}
	}
	
	//冒泡排序
	public void bubble(int a[]){
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	//赋值
	public void equal(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100);
		}
	}
	
	public void showList(int a[]) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		
		}
		System.out.println();
		
	}
	
	//迭代数组显示
	public void showIter(int a[]) {
		for(int node: a) {
			System.out.print(node+"\t");
			
		}
	
	}
	
	//迭代找最大
	public void showFindMax(int a[]) {
		int max=a[0];
		for(int node :a) {
			if(node>max) {
				max=node;
			}
			
		}
		System.out.println("max:"+max);
	}
	public static void main(String[] args) {
		
		sortedList a=new sortedList();
		int[] ori=new int[5];
		a.equal(ori);
		System.out.println("origin");
		a.showList(ori);
		a.showFindMax(ori);
//		a.chooseSort(ori);
//		a.bubble(ori);
//		System.out.println("now"+"\n");
//		a.showList(ori);
//		System.out.println("Iter SHOw");
//		a.showIter(ori);
		
}
}
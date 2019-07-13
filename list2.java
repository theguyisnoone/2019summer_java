package listReview;

public class list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one
		int[]a =new int[6];
	
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100);
		}
		System.out.println("origin");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
//		int[]b=new int[a.length];
//		for(int j=0;j<a.length;j++) {		
//				b[j]=a[a.length-1-j];
//			
//			
//		}
//		System.out.println("now");
//		for(int j=0;j<b.length;j++) {
//			System.out.print(b[j]+" ");
//		}
		//two
		 for (int i = 0; i < a.length/2; i++) {
	            int middle = a[a.length-i-1];
	            a[a.length-i-1] = a[i];
	            a[i] = middle;
	        }       
	        System.out.println("再次反转后的数组中各个值是:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	}

}

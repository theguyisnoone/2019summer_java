import java.util.Random;

public class StringString {
	public static void main(String[] args) {
		 String[] ss = new String[100];
	      // 初始化
		 ss[0]="ab";
		 ss[1]="ab";
		 ss[2]="ab";
	      for (int i = 3; i < ss.length; i++) {
	          ss[i] = randomString(2);
	      }
	      // 打印
	      for (int i = 0; i < ss.length; i++) {
	          System.out.print(ss[i] + " ");
	          if (19 == i % 20)
	              System.out.println();
	      }
	      judgeRepeated(ss);
	}
	 private static void judgeRepeated(String[] ss) {
	
		 
		 for(int i=0;i<ss.length;i++) {
			int repeat=0;
			 for(int j=i+1;j<ss.length;j++) {
				
				repeat++;
				 if(ss[i].equalsIgnoreCase(ss[j])) {
					 recordRepeated(ss[j]);
				
					 break;
				 }
			 }
			
			 
		 }
		 show();
	 }
	 
	 private static void show() {
		// TODO Auto-generated method stub
		 System.out.printf("总共有 %d种重复的字符串%n", pos);
	        if (pos != 0) {
	            System.out.println("分别是：");
	            for (int i = 0; i < pos; i++) {
	                System.out.print(foundDuplicated[i] + " ");
	            }
	        } 
	}

	static String[] foundDuplicated = new String[100];
	    static int pos;
	public static void recordRepeated(String s) {
		System.out.println(pos
				);
		//pos liMit 
		 for (int i = 0; i < pos; i++){
	            if (foundDuplicated[i].equalsIgnoreCase(s)) {
	            	//提前结束了
	            	return;
	            }
	        }
	 
	        foundDuplicated[pos++] = s;
	       
	}
	
	  private static String randomString(int length) {
	         
	        //字符串str保存所有字母字符和数字字符，用来生成随机字符串
	        String str="abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	         
	        //实例化一个random对象
	        Random random=new Random();
	         
	        //实例化一个StringBuilder对象，用来保存生成的随机字符串
	        StringBuilder sb=new StringBuilder();
	         
	        //通过循环生成长度为length的随机字符串
	        for(int i=0;i<length;i++) {
	             
	            //利用random.nextInt(int number)方法，生成一个介于[0,number)之间的随机数
	            int number=random.nextInt(62);   //生成一个[0,62)之间的随机数
	             
	            //根据数字number在字符串str中找到这个字符，然后插入到sb中
	            sb.append(str.charAt(number));
	        }
	         
	        //将sb转换成字符串类型并返回
	        return sb.toString();
	    }
	  
	 
	  
}

import java.util.Random;

public class StringString {
	public static void main(String[] args) {
		 String[] ss = new String[100];
	      // ��ʼ��
		 ss[0]="ab";
		 ss[1]="ab";
		 ss[2]="ab";
	      for (int i = 3; i < ss.length; i++) {
	          ss[i] = randomString(2);
	      }
	      // ��ӡ
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
		 System.out.printf("�ܹ��� %d���ظ����ַ���%n", pos);
	        if (pos != 0) {
	            System.out.println("�ֱ��ǣ�");
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
	            	//��ǰ������
	            	return;
	            }
	        }
	 
	        foundDuplicated[pos++] = s;
	       
	}
	
	  private static String randomString(int length) {
	         
	        //�ַ���str����������ĸ�ַ��������ַ���������������ַ���
	        String str="abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	         
	        //ʵ����һ��random����
	        Random random=new Random();
	         
	        //ʵ����һ��StringBuilder���������������ɵ�����ַ���
	        StringBuilder sb=new StringBuilder();
	         
	        //ͨ��ѭ�����ɳ���Ϊlength������ַ���
	        for(int i=0;i<length;i++) {
	             
	            //����random.nextInt(int number)����������һ������[0,number)֮��������
	            int number=random.nextInt(62);   //����һ��[0,62)֮��������
	             
	            //��������number���ַ���str���ҵ�����ַ���Ȼ����뵽sb��
	            sb.append(str.charAt(number));
	        }
	         
	        //��sbת�����ַ������Ͳ�����
	        return sb.toString();
	    }
	  
	 
	  
}

package e.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestError {
	 public static void main(String[] args) throws FileNotFoundException {
         
	        File f= new File("d:/WeChatSetup.exe");
	        try {
	            new FileInputStream(f); 
	            System.out.println("�ɹ���");
	        }
	        catch(Exception e){//FileNotFoundException
	        	e.printStackTrace();
	        }
	        
	        //��ͼ���ļ�LOL.exe�����׳�FileNotFoundException�������������쳣���ͻ��б������
	   
	          
	    }
}

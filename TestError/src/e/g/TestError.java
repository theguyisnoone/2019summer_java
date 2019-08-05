package e.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestError {
	 public static void main(String[] args) throws FileNotFoundException {
         
	        File f= new File("d:/WeChatSetup.exe");
	        try {
	            new FileInputStream(f); 
	            System.out.println("成功打开");
	        }
	        catch(Exception e){//FileNotFoundException
	        	e.printStackTrace();
	        }
	        
	        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
	   
	          
	    }
}

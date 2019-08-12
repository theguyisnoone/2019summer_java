import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void copyFile(String srcFile, String destFile){
		File to=new File(destFile);
		File from=new File(srcFile);
		 byte[] buffer = new byte[1024];
		  
	        try (
	                FileInputStream fis = new FileInputStream(srcFile);
	                FileOutputStream fos = new FileOutputStream(destFile);             
	        ){
	            while(true){
	                //实际读取的长度是 actuallyReaded,有可能小于1024
	                int actuallyReaded = fis.read(buffer);
	                //-1表示没有可读的内容了
	                if(-1==actuallyReaded)
	                    break;
	                fos.write(buffer, 0, actuallyReaded);
	                fos.flush();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	public static void main(String[] args) {
		copyFile("d:/template.txt","d:/newtemplate.txt");
	}
}

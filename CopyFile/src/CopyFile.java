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
	                //ʵ�ʶ�ȡ�ĳ����� actuallyReaded,�п���С��1024
	                int actuallyReaded = fis.read(buffer);
	                //-1��ʾû�пɶ���������
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

package Stream;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {
	public static void main(String[] args) {
		
		try {
			File f=new File("d:/xyz/lol2.txt");
			 File dir = f.getParentFile();
			if(!dir.exists()) {
				
				dir.mkdirs();
			}
			byte data[]= {88,89,90};
			FileOutputStream fos=new FileOutputStream(f);
			fos.write(data);
			fos.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	} 
}

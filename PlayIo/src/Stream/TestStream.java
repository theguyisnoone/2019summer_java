package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class TestStream {
	public static void main(String[] args) {
		//read
		try {
			File f=new File("d:/test.txt");//save "AB" in this test
			FileInputStream fis=new FileInputStream(f);
			byte[] all=new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all) {
				System.out.println(b);
			}
			fis.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			File f=new File("d:/dota222.txt");
			byte data[]={88,89};
			FileOutputStream fos=new FileOutputStream(f);
			fos.write(data);
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

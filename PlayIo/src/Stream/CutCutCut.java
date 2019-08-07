package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CutCutCut {
	static int clipLength=100*1024;
	public static void readFile(File f) throws IOException {
		if (0 == f.length())
            throw new RuntimeException("could not be cut");
		FileInputStream  fis=new FileInputStream(f);
		byte all[]=new byte[(int)f.length()];
		fis.read(all);
		fis.close();
		
		cutFile(f,all,clipLength);
	}
	public static void  cutFile(File f,byte[] all,int length) throws IOException {
		int fileNumber;
		if(0==all.length%length) {
			fileNumber=(int)(all.length/length);
		}else {
			fileNumber=(int)(all.length/length)+1;//plus one
		}
		for(int i=0;i<fileNumber;i++) {
			//clip file name
			String clipFileName=f.getName()+"_"+i;
			//create
			File clipFile=new File(f.getParent(),clipFileName);
			byte[]clipData;
			if(i!=fileNumber-1) {
				clipData=Arrays.copyOfRange(all, length*i, length*(i+1)); 		
			}else {
				clipData=Arrays.copyOfRange(all, length*i,all.length); 		
			}
			writeFile(clipFile,clipData);
		}
		
	}
	public static void writeFile(File clipFile,byte[] clipData) throws IOException {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(clipFile);
			
			fos.write(clipData);
			fos.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException {
		File  f=new File("d:/SteamSetup.exe");
		readFile(f);
	}
}

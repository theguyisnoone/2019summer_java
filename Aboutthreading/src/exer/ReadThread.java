package exer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadThread extends Thread {
	private File file;
	private String search;
	public ReadThread(File file,String search) {
		this.file=file;
		this.search=search;
	}
	public void run() {
		String fileContent=readFileContent(file);
		if(fileContent.contains(search)){
	        System.out.printf("找到子目标字符串%s,在文件:%s%n",search,file);
	    }
	}
	
	public static String readFileContent(File file) {
		try(FileReader fr=new FileReader(file)){
			char[]all=new char[(int)file.length()];
			fr.read(all);
			return new String(all);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

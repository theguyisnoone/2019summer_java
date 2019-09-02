package exer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lookforFile   {


	
	
	public static void search(File file,String search) {
		if(file.isFile()) {
			if(file.getName().toLowerCase().endsWith("java")) {
				new ReadThread(file,search).start();
			}
		}
		if(file.isDirectory()) {
			File[] fsFiles=file.listFiles();
			for(File f:fsFiles) {
				search(f,search);
			}
		}
	}
	public static void main(String[] args) {
		File path=new File("D:\\2019summer_java");
		search(path,"class");
	}
}

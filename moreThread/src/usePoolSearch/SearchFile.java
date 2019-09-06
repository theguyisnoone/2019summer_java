package usePoolSearch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchFile {
	//get file path
	public static void findFile(File file) {
		if(file.isDirectory()) {
			File[] files=file.listFiles();
			for(File f:files) {
				findFile(f);
			}
		}
		if(file.isFile()) {
			if(file.getName().toLowerCase().endsWith("java")) {
				 Thread t1= new Thread(){
			            public void run(){
			                findContents(file,"java");
			                            
			            }
			        };
			         
			        t1.start();
			}
		}
		
	}
	
	
	public static void findContents(File f,String  target) {
		try (FileReader fr = new FileReader(f)){
			 char[] all = new char[(int) f.length()];
			 fr.read(all);
			 String content=new String(all);
			 if(content.contains(target)) {
				 System.out.format("%s  %s contains %s",Thread.currentThread(),f,target);
				 System.out.println();
			 }
		}catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	
}

package BufferStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class removeComment {
	public static void removeComments(File javaFile) {
		 StringBuffer sb = new StringBuffer();
	        //读取内容
	        try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);) {
	            while (true) {
	                String line = br.readLine();
	                if (null == line)
	                    break;
	                //如果不是以//开头，就保存在StringBuffer中
	                if (!line.trim().startsWith("//"))
	                    sb.append(line).append("\r\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	        try (
	            FileWriter fw = new FileWriter(javaFile);
	            PrintWriter pw = new PrintWriter(fw);
	        ) {
	            //写出内容
	            pw.write(sb.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	public static void main(String[] args) {
		File f=new File("D://tt.java");
		 System.out.println(f.exists());
		 System.out.println(f.length());
		removeComments(f);
	}
}

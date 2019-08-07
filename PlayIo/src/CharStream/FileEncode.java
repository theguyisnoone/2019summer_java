package CharStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncode {
	 public static boolean isLetterOrDigit(char c) {
	        // 不使用Character类的isLetterOrDigit方法是因为，中文也会被判断为字母
	        String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        return -1 == letterOrDigital.indexOf(c) ? false : true;
	    }
	 
	 public void readAndWrite(File f) {
		 try(FileReader fr=new FileReader(f)){
			 char all[]=new char[(int)f.length()];
			 fr.read(all);
			 System.out.println("before:");
			 for(char c:all) {
				 System.out.print(c);
			 }
			 encode(all);
			 System.out.println();
			 System.out.println("after:");
			 for(char c:all) {
				 System.out.print(c);
			 }
			 File f1=new File("d:/a1.txt");
			 try(FileWriter fw=new FileWriter(f1)){
				 fw.write(all);
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		
		 
	 }
	 
	 public void encode(char[] all) {
		 //developed for only work for reading
		 for(int i=0;i<all.length;i++) {
			 char temp=all[i];
			 if(isLetterOrDigit(temp)) {
				 switch(temp) {
				 case '9':
					 temp='0';
					 break;
				 case 'z':
					 temp='a';
					 break;
				 case 'Z':
					 temp='A';
					 break;	 
				default:
					temp++;
					break;
					 
				 }
			 }
			 all[i]=temp;
		 }
	 }
	 
	public static void main(String[] args) {
		File f=new File("d:/a.txt");
		FileEncode fe1=new FileEncode();
		fe1.readAndWrite(f);
	}
}

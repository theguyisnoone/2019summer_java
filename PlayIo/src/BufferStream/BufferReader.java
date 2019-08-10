package BufferStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferReader {
 public static void main(String[] args) {
	 //read
	File f=new File("d:/lol.txt");
	try(FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);)//must have another bufferStream
	{
		while(true) {
			String line=br.readLine();//read only one line
			if(null == line) {
				break;
			}
			System.out.println(line);
		}
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//writer
	
	File f2=new File("d:/lxxxx.txt");
	System.out.println("write");
	try(FileWriter fw = new FileWriter(f2);
            PrintWriter pw = new PrintWriter(fw);)//must have another bufferStream
	{
		 pw.println("garen kill teemo");
		 pw.flush();//force write no matter how full 
         pw.println("teemo revive after 1 minutes");
         pw.flush(); 
         pw.println("teemo try to garen, but killed again");	
         pw.flush(); 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package DataStream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class exer {
	public void bufferRead(File f) {
		 try (
				 FileReader fr = new FileReader(f);
                 BufferedReader br = new BufferedReader(fr);              
	        ){
	          
	            String str = br.readLine();
	              String result[]=str.split("@");
	            for(String s:result) {
	            	System.out.println(s);
	            }
	  
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	public void bufferWriter(File f) {
		try(FileWriter fw = new FileWriter(f);
	            PrintWriter pw = new PrintWriter(fw);)//must have another bufferStream
		{
			 pw.println("31@15");
	          
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DataRead(File f) {
		 try (
	                FileInputStream fis  = new FileInputStream(f);
	                DataInputStream dis =new DataInputStream(fis);//only read file which writes with DATAoutputStream
	        ){
	         
	           System.out.println(dis.readUTF());
	           System.out.println(dis.readUTF());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	public void DataWriter(File f) {	
		 try (
	                FileOutputStream fos  = new FileOutputStream(f);
	                DataOutputStream dos =new DataOutputStream(fos);
	        ){
	           
	            
	            dos.writeUTF("31");
	            dos.writeUTF("15");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	public static void main(String[] args) {
		File f=new  File("d:/t.txt");
		exer e=new exer();
		e.DataWriter(f);
		e.DataRead(f);
		File f2=new  File("d:/t.txt");
		e.bufferWriter(f2);
		e.bufferRead(f2);
	}
}

package Chinese;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class getRidOfBom {
	  public static void main(String[] args) {
	        File f = new File("D:\\test1.txt");// save as utf-8
	        try (FileInputStream fis = new FileInputStream(f);) {
	            byte[] all = new byte[(int) f.length()];
	            fis.read(all);
	            System.out.println("����ȷ�ϰ���UTF-8ʶ������У�");
	            String str = new String(all,"UTF-8");
	            System.out.println(str);
	            System.out.println("����ǰ�����ѧ��֪��'��'�ֶ�Ӧ��UTF-8�����ǣ�e4 b8 ad");
	            System.out.println("��ӡ���ļ������е����ݵ�16�����ǣ�");
	            for (byte b : all) {
	                int i = b&0xff;
	                System.out.print(Integer.toHexString(i)+ " ");
	            }
	            System.out.println();
	            System.out.println("ͨ���۲취�ó� UTF-8�� BOM �� ef bb bf");
	            byte[] bom = new byte[3];
	            bom[0] = (byte) 0xef;
	            bom[1] = (byte) 0xbb;
	            bom[2] = (byte) 0xbf;
	            byte[] fileContentWithoutBOM= removeBom(all,bom);
	            System.out.println("ȥ����BOM֮������ݵ�16�����ǣ�");
	            for (byte b : fileContentWithoutBOM) {
	                int i = b&0xff;
	                System.out.print(Integer.toHexString(i)+ " ");
	            }           
	            System.out.println();
	            System.out.println("��Ӧ���ַ�����û���ʺ��ˣ�");
	            String strWithoutBOM=new String(fileContentWithoutBOM,"UTF-8");
	            System.out.println(strWithoutBOM);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	   
	    }
	 
	    private static byte[] removeBom(byte[] all, byte[] bom) {
	        return Arrays.copyOfRange(all, bom.length, all.length);
	    }
}

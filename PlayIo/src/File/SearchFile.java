package File;

import java.io.File;


public class SearchFile {
	
	public static void main(String[] args) {
//		�����ļ���c:\windows\d3dx9_35.dll�����С��5,073,256�ֽ�
//		��С���ļ���c:\windows\win.ini�����С��92�ֽ�
		File dir=new File("C:\\WINDOWS");
		File[] files=dir.listFiles();
		long max=files[0].length();
		long min=Integer.MAX_VALUE;
		File maxName=files[0];
		File minName=files[0];
		for(File singleFile:files) {
			//avoid 0 C:\WINDOWS\addins
			if(singleFile.isDirectory()) {
				continue;
			}
			if(singleFile.length()>=max) {
				max=singleFile.length();
				maxName=singleFile;
			}
			if(singleFile.length()>0) {
				if(singleFile.length()<min) {
					min=singleFile.length();
					minName=singleFile;
				}
			}
		}
		System.out.printf("%d %s",max,maxName);
		System.out.println();
		System.out.printf("%d %s",min,minName);
		
	}

}

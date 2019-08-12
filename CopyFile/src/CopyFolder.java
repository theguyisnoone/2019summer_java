import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolder {
	public static void copyFile(String srcPath, String destPath){
        
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
         
        //��������һ���Զ�ȡ1024�ֽ�
        byte[] buffer = new byte[1024];
 
        try (
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(destFile);
        ){
            while(true){
                //ʵ�ʶ�ȡ�ĳ����� actuallyReaded,�п���С��1024
                int actuallyReaded = fis.read(buffer);
                //-1��ʾû�пɶ���������
                if(-1==actuallyReaded)
                    break;
                fos.write(buffer, 0, actuallyReaded);
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
     
    /**
     * 
     * @param srcPath Դ�ļ���
     * @param destPath Ŀ���ļ���
     */
    public static void copyFolder(String srcPath, String destPath){
         
        File srcFolder = new File(srcPath);
        File destFolder = new File(destPath);
        //Դ�ļ��в�����
        if(!srcFolder.exists())
            return;
        //Դ�ļ��в���һ���ļ���
        if(!srcFolder.isDirectory())
            return;
        //Ŀ���ļ�����һ���ļ�
        if(destFolder.isFile())
            return;
        //Ŀ���ļ��в�����
        if(!destFolder.exists())
            destFolder.mkdirs();

        //����Դ�ļ���
        File[] files=  srcFolder.listFiles();
        for (File srcFile : files) {
        	//������ļ����͸���
            if(srcFile.isFile()){
                File newDestFile = new File(destFolder,srcFile.getName());
                copyFile(srcFile.getAbsolutePath(), newDestFile.getAbsolutePath());
            }
        	//������ļ��У��͵ݹ�
            if(srcFile.isDirectory()){
                File newDestFolder = new File(destFolder,srcFile.getName());
                copyFolder(srcFile.getAbsolutePath(),newDestFolder.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        copyFolder("d:/LOLFolder", "d:/LOLFolder2");
    }
}

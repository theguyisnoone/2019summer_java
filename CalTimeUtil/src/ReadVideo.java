/**�ο�
https://www.cnblogs.com/mysgk/p/4117134.html**/
/**jar����ַ
 * http://www.sauronsoftware.it/projects/jave/download.php 
**/
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;

import java.io.File;

public class ReadVideo {

    public static void main(String[] args){
        File source = new File("D:\\japanese\\���������﷨��˼ά\\�����﷨��˼ά����");
        Encoder encoder = new Encoder();
        File[] file = source.listFiles();
        long sum =0;
        int controlTime=2;//����ʱ��
//        for (File file2 : file) {
         for (int i=0;i<file.length;i++) {	
            try {
                 MultimediaInfo m = encoder.getInfo(file[i]);
                 double ls = m.getDuration()/1000;//ls�ǻ�ȡ��������
                 System.out.println("�ļ�����"+file[i].getName()+"  "+i+":"+ls/60+"min");
                 sum += ls;
                 if(sum>=3600*controlTime) {
                	 System.out.println(controlTime+"��Сʱ��");
                	 break;
                 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double sum1 = (double)sum;
        double sum2 =sum1/3600;// ת����Ϊ��Сʱ
        System.out.println("file number: "+file.length);
        System.out.println("all spent: "+sum2+"h");
    }
}
/**参考
https://www.cnblogs.com/mysgk/p/4117134.html**/
/**jar包地址
 * http://www.sauronsoftware.it/projects/jave/download.php 
**/
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;

import java.io.File;

public class ReadVideo {

    public static void main(String[] args){
        File source = new File("D:\\japanese\\安宁日语语法新思维\\日语语法新思维初级");
        Encoder encoder = new Encoder();
        File[] file = source.listFiles();
        long sum =0;
        int controlTime=2;//控制时间
//        for (File file2 : file) {
         for (int i=0;i<file.length;i++) {	
            try {
                 MultimediaInfo m = encoder.getInfo(file[i]);
                 double ls = m.getDuration()/1000;//ls是获取到的秒数
                 System.out.println("文件名："+file[i].getName()+"  "+i+":"+ls/60+"min");
                 sum += ls;
                 if(sum>=3600*controlTime) {
                	 System.out.println(controlTime+"个小时了");
                	 break;
                 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double sum1 = (double)sum;
        double sum2 =sum1/3600;// 转换成为了小时
        System.out.println("file number: "+file.length);
        System.out.println("all spent: "+sum2+"h");
    }
}
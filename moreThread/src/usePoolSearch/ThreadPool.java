package usePoolSearch;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	
	public static void main(String[] args) throws InterruptedException {
		String path="D:\\2019summer_java\\";
		File f1=new File(path);
		System.out.println("success");
        ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
           
        threadPool.execute(new Runnable(){
   
            @Override
            public void run() {
                // TODO Auto-generated method stub
            	
            		
            		SearchFile.findFile(f1);
            }

		
               
        });
   
    }
}

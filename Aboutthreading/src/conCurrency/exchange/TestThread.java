package conCurrency.exchange;

import java.util.LinkedList;
import java.util.List;

public class TestThread {
    
    public static void main(String[] args) {
    
        final Hero gareen = new Hero();
        gareen.name = "¸ÇÂ×";
        gareen.hp = 616;
       Thread[] hurts=new Thread[5];
        Thread[] recoverys=new Thread[2];
        for(int i=0;i<5;i++) {     
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                       
                    //ÎÞÐèÑ­»·ÅÐ¶Ï
//                    while(gareen.hp==1){
//                        continue;
//                    }
                       
                    gareen.hurt();
                     
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t1.start();
        hurts[i]=t1;
        }
        for(int j=0;j<2;j++) {
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();
   
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
   
            }
        };
        t2.start();
        recoverys[j]=t2;
        }   
        
        for(Thread t:hurts) {
        	try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        for(Thread t:recoverys) {
        	try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
          
}

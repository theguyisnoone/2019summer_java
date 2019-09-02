package extendsThread;

public class TestThread {
	  public static void main(String[] args) {
	         
	        Hero gareen = new Hero();
	        gareen.name = "¸ÇÂ×";
	        gareen.hp = 616;
	        gareen.demage = 50;
	 
	        Hero teemo = new Hero();
	        teemo.name = "ÌáÄª";
	        teemo.hp = 300;
	        teemo.demage = 30;
	         
	        Hero bh = new Hero();
	        bh.name = "ÉÍ½ğÁÔÈË";
	        bh.hp = 500;
	        bh.demage = 65;
	         
	        Hero leesin = new Hero();
	        leesin.name = "Ã¤É®";
	        leesin.hp = 455;
	        leesin.demage = 80;
	         
	        KillThread killThread1 = new KillThread(gareen,teemo);
	        killThread1.start();
	        KillThread killThread2 = new KillThread(bh,leesin);
	        killThread2.start();
	         
	    }
}

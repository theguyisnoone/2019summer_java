package lamda;

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
	        bh.name = "ÉÍ½ðÁÔÈË";
	        bh.hp = 500;
	        bh.demage = 65;
	         
	        Hero leesin = new Hero();
	        leesin.name = "Ã¤É®";
	        leesin.hp = 455;
	        leesin.demage = 80;
	        
	        Thread t1=new Thread() {
	        	public void run() {
	        		while(!teemo.isDead()) {
	        			gareen.attackHero(teemo);
	        		}
	        	}
	        };
	        t1.start();
	        Thread t2= new Thread(){
	            public void run(){
	                while(!leesin.isDead()){
	                    bh.attackHero(leesin);
	                }              
	            }
	        };
	        t2.start();
	    }
}

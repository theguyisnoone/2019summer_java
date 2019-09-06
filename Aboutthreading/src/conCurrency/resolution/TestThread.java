package conCurrency.resolution;

public class TestThread {
	public static void main(String[] args) {
	
		final Hero garren=new Hero();
		garren.name="garren";
		garren.hp=10000;
		
		System.out.printf("origin blood is %d",garren.hp);
		
		//create threads
		int n=10000;
		Thread[] add=new Thread[n];
		Thread[]  reduce=new Thread[n];
		for(int i=0;i<n;i++) {
			Thread t=new Thread() {
				public void run() {
					synchronized(garren) {
					garren.recover();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
			add[i]=t;
		}
		
		for(int i=0;i<n;i++) {
			Thread t=new Thread() {
				public void run() {
					synchronized(garren) {
					garren.hurt();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};
			t.start();
			reduce[i]=t;
		}
		
		//wait them ends
		for(Thread t:add) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(Thread t:reduce) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//result
		 System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %d", n,n,garren.hp);
		 
		 //need to run serval times
	}
}

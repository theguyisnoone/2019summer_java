package ProducerAndConsumers;

public class ProducerThread extends Thread {
	private MyStack<Character> stack;
	 public ProducerThread(MyStack<Character> stack,String name){
	        super(name);
	        this.stack =stack;
	    }
	 
	 public void run(){
         
	        while(true){
	            char c = randomChar();
	            System.out.println(this.getName()+" ѹ��: " + c);
	            stack.push(c);
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	         
	    }
	 public char randomChar(){
	        return (char) (Math.random()*('Z'+1-'A') + 'A');
	        }
}

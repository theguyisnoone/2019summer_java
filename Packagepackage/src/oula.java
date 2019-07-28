
public class oula {



	 public static void main(String[] args){
	        int sum=0;
	        int max=1000*10000;
	        double startTime=System.currentTimeMillis();
	        boolean[] isprime=new boolean[max+1];
	        for(int i=1;i<max;i++){
	            isprime[i]=true;
	        }
	        for(int i=2;i<Math.sqrt(max);i++) {
	            if (isprime[i]) {
	                for(int j=i*i;j<max;j+=i){//eg. 2  all 2 de beishu 
	                    isprime[j]=false;
	                }
	            }
	        }
	        for(int i=1;i<max;i++){
	            if(isprime[i]){
	                sum++;
	            }
	        }
	        double timeSpent=(System.currentTimeMillis()-startTime)/1000;
	        System.out.println(sum+" "+timeSpent);
	    }
	}
package playCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exerCollections {
	public static void main(String[] args) {
		List ran=new ArrayList<>();
		for(int i=0;i<10;i++) {
			ran.add(i);
		}
		System.out.println(ran);
		int count=0;
		for(int i=0;i<1e6;i++) {
			Collections.shuffle(ran);
			if((int)ran.get(0)==3&&(int)ran.get(1)==1&&(int)ran.get(2)==4) {
				count+=1;
				System.out.println(ran);
			}
		}
		System.out.println(count);
	    System.out.println("rate:"+(double)count/1e6);
	} 
}

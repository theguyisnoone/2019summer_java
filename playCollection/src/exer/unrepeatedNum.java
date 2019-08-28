package exer;

import java.util.HashSet;

public class unrepeatedNum {
		public static void main(String[] args) {
			HashSet<Integer> hs=new HashSet<>();
			while(hs.size()<50) {
				int num=(int)(Math.random()*10000);
				hs.add(num);
			}
			System.out.println(hs);
		}
}

package hashset;

import java.util.HashSet;

public class exerHashSet {
	public static String randomString(int length) {
		String pool="";
		for(short  i='0';i<='9';i++) {
			pool+=(char)i;
		}
		for(short i='a';i<='z';i++) {
			pool+=(char)i;
		}
		for(short i='A';i<='Z';i++) {
			pool+=(char)i;
		}
		char cs[]=new char[length];
		for(int i=0;i<cs.length;i++) {
			int index=(int)(Math.random()*pool.length());
			cs[i]=pool.charAt(index);//add element
		}
		String result=new String(cs);
		return result;
	}
	public static void main(String[] args) {
		//create
		String ss[]=new String[100];
		for(int i=0;i<ss.length;i++) {
			ss[i]=randomString(2);
		}
		//print
		for(int i=0;i<ss.length;i++) {
			if(i!=0&&0==i%20) {
				System.out.println();
			}
			System.out.print(ss[i]+" ");
			
		}
		System.out.println();
		//repeated
		HashSet<String> result=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ss.length;i++) {
			if(result.contains(ss[i])) {
				sb.append(ss[i]+" ");
			}
			result.add(ss[i]);
		}
		System.out.println("rested:"+result.size());
		System.out.println("repeated :"+(ss.length-result.size()));
		System.out.println(sb);
		
		
		//author
//		for(String s1:ss) {
//			int repeat=0;
//			for(String s2:ss) {
//				if(s1.equalsIgnoreCase(s2)) {
//					repeat++;
//					if(2==repeat) {
//						result.add(s2);
//						break;
//					}
//				}
//			}
//		}
//		   System.out.printf("总共有 %d种重复的字符串%n", result.size());
//	        if (result.size() != 0) {
//	            System.out.println("分别是：");
//	            for (String s : result) {
//	                System.out.print(s + " ");
//	            }
//	        }
	}
}

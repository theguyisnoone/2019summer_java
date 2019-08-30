package lowList;

import java.util.Collections;
import java.util.HashMap;

public class HashMapFind {
	public static void main(String[] args) {
		HashMap<String,Hero> heromap=new HashMap<>();
		for(int i=0;i<2e6;i++) {
			Hero h=new Hero("hero "+i);
			heromap.put(h.name,h );
		}
		for(int i=0;i<10;i++) {
		     long start = System.currentTimeMillis();
             
	            //查找名字是Hero 1000000的对象
	            Hero target = heromap.get("hero 1000000");
	            System.out.println("找到了 hero!" + target.name);
	              
	            long end = System.currentTimeMillis();
	            long elapsed = end - start;
	            System.out.println("一共花了：" + elapsed + " 毫秒");
	        }
		}
	}


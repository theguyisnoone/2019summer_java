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
             
	            //����������Hero 1000000�Ķ���
	            Hero target = heromap.get("hero 1000000");
	            System.out.println("�ҵ��� hero!" + target.name);
	              
	            long end = System.currentTimeMillis();
	            long elapsed = end - start;
	            System.out.println("һ�����ˣ�" + elapsed + " ����");
	        }
		}
	}


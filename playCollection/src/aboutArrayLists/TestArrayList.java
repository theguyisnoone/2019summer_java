package aboutArrayLists;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList heros=new  ArrayList();
		//add
		for(int i=0;i<5;i++) {
			heros.add(new  Hero("hero"+i));
		}
		System.out.println(heros);
		Hero specialHero=new Hero("Special hero");
		heros.add(3, specialHero);
		System.out.println(heros.toString());
		
		//contains
		System.out.println(heros.contains(new Hero("hero 1")));//cauz new 
		System.out.println(heros.contains(specialHero));
		
		//get
		System.out.println(heros.get(5));
		
		//indexOF
	      System.out.println("specialHero������λ��:"+heros.indexOf(specialHero));
	      System.out.println("�µ�Ӣ�ۣ�����������\"hero 1\"������λ��:"+heros.indexOf(new Hero("hero 1")));//cauz new 
	    
//	      //remove
//	      System.out.println(heros);
//	      heros.remove(2);
//	      System.out.println(heros);
//	      heros.remove(specialHero);
//	      System.out.println(heros);
	    
	      //set() means replace
	      heros.set(5, new Hero("hero xxx"));
	      System.out.println(heros);
	      
	      //size()
	      System.out.println(heros.size());
	
	      //toArray()
	      Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
	        System.out.println("����:" +hs);//be a array
	        
	        //addAll() copy new array to old one [old_begin-old_end ,new_begin-old_begin] 
	        ArrayList anotherHeros = new ArrayList();
	        anotherHeros.add(new Hero("hero a"));
	        anotherHeros.add(new Hero("hero b"));
	        anotherHeros.add(new Hero("hero c"));
	        System.out.println("anotherHeros heros:\t" + anotherHeros);
	        heros.addAll(anotherHeros);
	        System.out.println("����һ��ArrayList��Ԫ�ض����뵽��ǰArrayList:");
	        System.out.println("ArrayList heros:\t" + heros);
	        
	        
	}

	
}

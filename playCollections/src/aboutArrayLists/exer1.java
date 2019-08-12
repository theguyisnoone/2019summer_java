package aboutArrayLists;

import java.util.ArrayList;

public class exer1 {
	//find  an element in array
	public static void main(String[] args) {
		ArrayList heros=new ArrayList();
		for(int i=0;i<5;i++) {
			heros.add(new Hero("hero "+i));
		}
		System.out.println(heros);
		String target="hero 1";
		for(int i=0;i<heros.size();i++) {
			Hero h=(Hero)heros.get(i);
			if(target.equals(h.name)) {
				System.out.println("find");
				break;
			}
		}
	}
}

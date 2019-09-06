package conCurrency.list;

import java.util.Collections;
import java.util.LinkedList;

public class sychronizedStack implements Stack{
	LinkedList<Hero> heros=new LinkedList<>();
	//or 
//	LinkedList<Hero> heros2=(LinkedList<Hero>)Collections.synchronizedList(new  LinkedList<Hero>());
//method doesnt need synchronized
	@Override
	public synchronized void push(Hero h) {
		// TODO Auto-generated method stub
		heros.addLast(h);
	}

	@Override
	public synchronized Hero pull() {
		// TODO Auto-generated method stub
		return heros.removeLast();
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return heros.getLast();
	}

}

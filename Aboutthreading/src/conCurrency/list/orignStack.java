package conCurrency.list;

import java.util.LinkedList;

public class orignStack implements Stack{
	LinkedList<Hero> heros=new LinkedList<>();


	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		heros.addLast(h);
	}

	@Override
	//get last one
	public Hero pull() {
		// TODO Auto-generated method stub
		return heros.removeLast();
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return heros.getLast();
	}
}

package aboutBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class HeroNode {
	public HeroNode leftHero;
	public HeroNode rightHero;
	public  Hero value;
	public void add(Hero v) {
		if(null==value) {
			value=v;
		}else {
			if(v.hp>value.hp) {
				if(null==leftHero) {
					leftHero=new HeroNode();
				}
				leftHero.add(v);
			}else {
				if(null==rightHero) {
					rightHero=new HeroNode();
				}
				rightHero.add(v);
			}
		}
		
	}
	public List<Object> values(){
		List<Object> values=new ArrayList<>();
		if(null !=leftHero) {
			values.addAll(leftHero.values());
		}
		values.add(value);
		if(null!=rightHero) {
			values.addAll(rightHero.values());
		}
		return values;
		
	}
	public static void main(String[] args) {
		List<Hero> hs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero h = new Hero();
            h.name = "hero " + i;
            h.hp = (float) (Math.random() * 900 + 100); // 100-1000�����Ѫ��
            hs.add(h);
        }
        System.out.println("��ʼ��10��Hero");
        System.out.println(hs);
        HeroNode heroTree = new HeroNode();
        for (Hero hero : hs) {
            heroTree.add(hero);
        }
        System.out.println("����Ѫ����������Hero");
        List<Object> treeSortedHeros = heroTree.values();
        System.out.println(treeSortedHeros);
	}
}

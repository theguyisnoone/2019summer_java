package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TEST1 {
	  public static void main(String[] args) {
	        Random r =new Random();
	        List<Hero> heros = new ArrayList<Hero>();
	            
	        for (int i = 0; i < 10; i++) {
	            //ͨ�����ֵʵ����hero��hp��damage
	            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
	        }
	        System.out.println("��ʼ����ļ��ϣ�");
	        System.out.println(heros);
	            
	        //ֱ�ӵ���sort����ֱ��������ΪHero�и�������
	        //���װ����������Խ��бȽϣ�CollectionsҲ��֪������ȷ��������û����
	        //Collections.sort(heros);
	            
	        //����Comparator��ָ���Ƚϵ��㷨
	        Comparator<Hero> c = new Comparator<Hero>() {
	            @Override
	            public int compare(Hero h1, Hero h2) {
	                //����hp��������
	                if(h1.hp>=h2.hp)
	                    return 1;  //������ʾh1��h2Ҫ��
	                else
	                    return -1;
	            }
	        };
	        Collections.sort(heros,c);
	        System.out.println("����Ѫ�������ļ��ϣ�");
	        System.out.println(heros);
	    }
}

package notThread;

public class TestThread {
//	not use thread
public static void main(String[] args) {
    Hero gareen = new Hero();
    gareen.name = "����";
    gareen.hp = 616;
    gareen.demage = 50;

    Hero teemo = new Hero();
    teemo.name = "��Ī";
    teemo.hp = 300;
    teemo.demage = 30;
     
    Hero bh = new Hero();
    bh.name = "�ͽ�����";
    bh.hp = 500;
    bh.demage = 65;
     
    Hero leesin = new Hero();
    leesin.name = "äɮ";
    leesin.hp = 455;
    leesin.demage = 80;
     
    //���׹�����Ī
    while(!teemo.isDead()){
        gareen.attackHero(teemo);
    }

    //�ͽ����˹���äɮ
    while(!leesin.isDead()){
        bh.attackHero(leesin);
    }
}
}

package aboutGeneric;

public class Item implements LoL {
	String name;
    int price;
     
    public Item(){
         
    }
     
    //�ṩһ����ʼ��name�Ĺ��췽��
    public Item(String name){
        this.name = name;
    }
     
    public void effect(){
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
    public String toString() {
        return name;
    }
}

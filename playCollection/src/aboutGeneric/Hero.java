package aboutGeneric;

public class Hero implements LoL{
	public String name;
    public float hp;
  
    public int damage;
  
    public Hero() {
  
    }
  
    // ����һ����ʼ��name�Ĺ��췽��
    public Hero(String name) {
  
        this.name = name;
    }
  
    public String getName() {
		return name;
	}
    // ��дtoString����
    public String toString() {
        return name;
    }
}

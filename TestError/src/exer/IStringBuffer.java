package exer;

public interface IStringBuffer {

	 public void append(String str) throws IndexIsOutofRangeException, IndexIsNagetiveException; //׷���ַ���
	    public void append(char c)  throws IndexIsOutofRangeException, IndexIsNagetiveException;   //׷���ַ�
	    public void insert(int pos,char b) throws IndexIsOutofRangeException, IndexIsNagetiveException; //ָ��λ�ò����ַ�
	    public void insert(int pos,String b) throws IndexIsOutofRangeException, IndexIsNagetiveException; ; //ָ��λ�ò����ַ���
	    public void delete(int start) throws IndexIsOutofRangeException, IndexIsNagetiveException; ; //�ӿ�ʼλ��ɾ��ʣ�µ�
	    public void delete(int start,int end) throws IndexIsOutofRangeException, IndexIsNagetiveException; ; //�ӿ�ʼλ��ɾ������λ��-1
	    public void reverse(); //��ת
	    public int length(); //���س���
}

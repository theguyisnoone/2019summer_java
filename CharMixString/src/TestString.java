
public class TestString {
	public static void main(String[] args) {
		   
        String sentence = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
         /*
          * chartAt()**/
        char c = sentence.charAt(0);
        //charAt(int index)��ȡָ��λ�õ��ַ�
        System.out.println(c);
         //��  
       
        
        /*
         * toCharArray() ��ȡ��Ӧ���ַ�����
         * **/
        char[] cs = sentence.toCharArray();
        System.out.println(sentence.length() == cs.length);
        //true
        
        /*
         * split*/
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
          
        /*
         * trim*/
        sentence = "        ����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�      ";
        System.out.println(sentence);
        //ȥ����β�ո�
        System.out.println(sentence.trim());
        
        /*
         * upper lower*/
        sentence = "Garen";
        
        //ȫ�����Сд
        System.out.println(sentence.toLowerCase());
        //ȫ����ɴ�д
        System.out.println(sentence.toUpperCase());
        
        
        
        /*
         * index contains*/
        sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
        
        System.out.println(sentence.indexOf('8')); //�ַ���һ�γ��ֵ�λ��
          
        System.out.println(sentence.indexOf("����")); //�ַ�����һ�γ��ֵ�λ��
          
        System.out.println(sentence.lastIndexOf("��")); //�ַ��������ֵ�λ��
          
        System.out.println(sentence.indexOf(',',5)); //��λ��5��ʼ�����ֵĵ�һ��,��λ��
          
        System.out.println(sentence.contains("��ɱ")); //�Ƿ�����ַ���"��ɱ"
	
        
        /*
         * replaceAll replaceFirst*/
        sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
        
        String temp = sentence.replaceAll("��ɱ", "����ɱ"); //�滻���е�
         
        temp = temp.replaceAll("����", "����");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//ֻ�滻��һ��
         
        System.out.println(temp);
	}
}


public class TestString {
	public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         /*
          * chartAt()**/
        char c = sentence.charAt(0);
        //charAt(int index)获取指定位置的字符
        System.out.println(c);
         //盖  
       
        
        /*
         * toCharArray() 获取对应的字符数组
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
        sentence = "        盖伦,在进行了连续8次击杀后,获得了 超神 的称号      ";
        System.out.println(sentence);
        //去掉首尾空格
        System.out.println(sentence.trim());
        
        /*
         * upper lower*/
        sentence = "Garen";
        
        //全部变成小写
        System.out.println(sentence.toLowerCase());
        //全部变成大写
        System.out.println(sentence.toUpperCase());
        
        
        
        /*
         * index contains*/
        sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置
          
        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置
          
        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置
          
        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置
          
        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
	
        
        /*
         * replaceAll replaceFirst*/
        sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
         
        temp = temp.replaceAll("超神", "超鬼");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//只替换第一个
         
        System.out.println(temp);
	}
}

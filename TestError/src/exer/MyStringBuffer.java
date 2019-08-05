package exer;

public class MyStringBuffer implements IStringBuffer {
	int capacity=16;
	int length=0;
	char[]value;//save char[]

	public MyStringBuffer() {
		value = new char[capacity];
	}
	
	public MyStringBuffer(String str) {
		this();
		if(null ==str) {
			value=str.toCharArray();
		}
		
		if(capacity<str.length()) {
			capacity=value.length*2;
			value=new char[capacity];
		}
		
		if(capacity>=str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
          
        length = str.length();
	} 
	
	@Override
	public void append(String str) throws IndexIsNagetiveException, IndexIsOutofRangeException{
		// TODO Auto-generated method stub
		insert(length,str);
	}

	@Override
	public void append(char c) throws IndexIsNagetiveException, IndexIsOutofRangeException{
		// TODO Auto-generated method stub
		append(String.valueOf(c));
	}

	@Override
	public void insert(int pos, char b)throws IndexIsNagetiveException, IndexIsOutofRangeException {
		
		// TODO Auto-generated method stub
		insert(pos,String.valueOf(b));//char to string
		
		
		
	}

	@Override
	public void insert(int pos, String b) throws IndexIsNagetiveException, IndexIsOutofRangeException{
		// TODO Auto-generated method stub
		if(pos<0) {
			throw new IndexIsNagetiveException();
		}
		if (pos > length)
            throw new IndexIsOutofRangeException();
 
        if (null == b)
            throw new NullPointerException();
		
		while(length+b.length()>capacity) { //while??
			 capacity = (int) ((length+b.length())*1.5f);
			 char[] newValue = new char[capacity];
	         System.arraycopy(value, 0, newValue, 0, length);//copr ori
	          value = newValue;//redirect
		}
		
		char[] cs=b.toCharArray();
		//move back
		System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
		System.arraycopy(cs,0, value,pos, cs.length);
		length = length+cs.length;
	}

	@Override
	public void delete(int start)throws IndexIsNagetiveException, IndexIsOutofRangeException {
		// TODO Auto-generated method stub
			delete(start,length);
	}

	@Override
	public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException{
		// TODO Auto-generated method stub
		  if(start<0)
	            throw new IndexIsNagetiveException();
	         
	        if(start>length)
	        	throw new IndexIsOutofRangeException();
	         
	        if(end<0)
	        	throw new IndexIsNagetiveException();
	         
	        if(end>length)
	        	throw new IndexIsOutofRangeException();
	         
	        if(start>=end)
	        	throw new IndexIsOutofRangeException();
	         
	        System.arraycopy(value, end, value, start, length- end);
	        length-=end-start;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for(int i=0;i<length/2;i++) {
			char temp=value[i];
			value[i]=value[length-i-1];
			value[length-i-1]=temp;
		}
			
			
			
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return length;
	}
	
	public String toString(){
        
        char[] realValue = new char[length];
  
        System.arraycopy(value, 0, realValue, 0, length);
          
        return new String(realValue);
          
    }
	
	public static void main(String[] args) {
		try {
            MyStringBuffer sb = new MyStringBuffer("there light");
            System.out.println(sb);
            sb.insert(0, "let ");
            System.out.println(sb);
            sb.insert(10, "be ");
            System.out.println(sb);
            sb.insert(0, "God Say:");
            System.out.println(sb);
            sb.append("!");
            System.out.println(sb);
            sb.append('?');
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);
 
            sb.reverse();
            System.out.println(sb);
 
            sb.delete(0, 4);
            System.out.println(sb);
            sb.delete(4);
            System.out.println(sb);
            sb.delete(-1);
            System.out.println(sb);
        } catch (IndexIsNagetiveException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IndexIsOutofRangeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	
    }

}

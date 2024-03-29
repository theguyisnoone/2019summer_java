package ObjectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializeHero {
	public static void main(String[] args) {
		Hero heros[]=new Hero[10];
		for(int i=0;i<heros.length;i++) {
			heros[i]=new Hero("hero:"+i);
		}
		File f =new File("d:/heros.lol");
		
		try(
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos =new ObjectOutputStream(fos);
	            FileInputStream fis = new FileInputStream(f);
	            ObjectInputStream ois =new ObjectInputStream(fis);
	        ) {
	            //把数组序列化到文件heros.lol
	            oos.writeObject(heros);
	            Hero[] hs2 = (Hero[]) ois.readObject();
	            System.out.println("查看中文件中反序列化出来的数组中的每一个元素：");
	            for (Hero hero : hs2) {
	                System.out.println(hero.name);
	            }
	                
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	             
	    }
	}


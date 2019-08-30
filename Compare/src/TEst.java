import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TEst {
	public static void main(String[] args) {
		 
        List<Item> is = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Item item =new Item( "Item " + i, (int) (Math.random()*100));
           
            is.add(item);
        }
        System.out.println("初始化的Items:");
        System.out.println(is);
        Collections.sort(is);
        System.out.println("排序后的Items:");
        System.out.println(is);
    }
}

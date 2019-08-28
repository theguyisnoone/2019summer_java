package aboutHashMap;

import java.util.HashMap;
import java.util.Set;

public class reverseKeyAndValue {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		HashMap<String,String> temp = new HashMap<>();
		hm.put("adc","phyiscal" );
		hm.put("apc", "magic");
		hm.put("t", "tank");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
        
        for (String key : keys) {
            String value = hm.get(key);
            temp.put(value, key);
        }
        hm.clear();
        hm.putAll(temp);
        System.out.println(hm);
	}
}

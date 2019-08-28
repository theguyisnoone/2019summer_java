package aboutHashMap;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String,String> dictionary=new HashMap<>();
		dictionary.put("adc", "physic");
		dictionary.put("apc", "magic");
		dictionary.put("t","tank");
		System.out.println(dictionary.get("t"));
	}
}

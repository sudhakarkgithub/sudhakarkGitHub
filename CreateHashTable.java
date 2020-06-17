package project23;

import java.util.Hashtable;
import java.util.Map;

public class CreateHashTable {

	
	public static void main(String[] args) {
		
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("abc", "123");
		map.put("xyz", "324");
		map.put(null, "33");
		map.put(null, "33");
		map.forEach((x,y) -> System.out.println(x + " " + y));
	}
}

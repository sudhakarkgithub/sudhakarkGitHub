package project23;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		map.put("one", 2);
		
		map.forEach((x,y)  -> {
			System.out.println(x);
			System.out.println(y);
		});
		
		
	}

}

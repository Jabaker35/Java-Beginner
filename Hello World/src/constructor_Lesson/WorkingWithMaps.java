package constructor_Lesson;

import java.util.*;

public class WorkingWithMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Hannah");
	        map.put(2, "Jamil");
	        map.put(3, "Alice");
	        map.put(3, "Carla");

	        System.out.println(map);

	        System.out.println(map.get(3));
	        System.out.println(map.keySet());
	        
	        for (int key : map.keySet()) {
	        	map.get(key);	        
	        }
	        
	        map.forEach((k, v) -> {
	        	System.out.println(k + " - " + v);
	        });
	        
	        map.getOrDefault(10, "oops this is defualt value");
	}

}
